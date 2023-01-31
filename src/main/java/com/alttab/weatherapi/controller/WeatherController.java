package com.alttab.weatherapi.controller;

import com.alttab.weatherapi.domain.dto.WeatherDto;
import com.alttab.weatherapi.domain.rest.WeatherAPI;
import com.alttab.weatherapi.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    private static final String WEATHER_API_URL = "http://api.weatherapi.com/v1/current.json?q={city}&key={apiKey}";

    @GetMapping("/weather")
    public WeatherDto getWeather(@RequestParam(value = "city") String city,
                                 @RequestParam(value = "apiKey") String apiKey) throws Exception {
        try {
            RestTemplate restTemplate = new RestTemplate();
            WeatherAPI weatherAPI = restTemplate.getForObject(WEATHER_API_URL, WeatherAPI.class, city, apiKey);
            assert weatherAPI != null;
            return WeatherService.getWeather(weatherAPI);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}