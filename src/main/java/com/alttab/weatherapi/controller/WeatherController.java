package com.alttab.weatherapi.controller;

import com.alttab.weatherapi.domain.response.WeatherResponse;
import com.alttab.weatherapi.domain.dto.WeatherDto;
import com.alttab.weatherapi.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;

@RestController
public class WeatherController {
    private static final String WEATHER_API_URL = "http://api.weatherapi.com/v1/current.json?q={city}&key={apiKey}";

    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam(value = "city") String city,
                                      @RequestParam(value = "apiKey") String apiKey) throws ParseException {
        try {
            RestTemplate restTemplate = new RestTemplate();
            WeatherDto weatherDto = restTemplate.getForObject(WEATHER_API_URL, WeatherDto.class, city, apiKey);
            assert weatherDto != null;
            return WeatherService.getWeather(weatherDto);
        } catch (ParseException e) {
            throw new ParseException("Error - ", e.getErrorOffset());
        }
    }
}