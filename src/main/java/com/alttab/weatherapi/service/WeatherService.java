package com.alttab.weatherapi.service;

import com.alttab.weatherapi.domain.dto.WeatherDto;
import com.alttab.weatherapi.domain.rest.WeatherAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherService {

    public static WeatherDto getWeather(WeatherAPI weatherAPI) throws ParseException {
        WeatherDto response = new WeatherDto();
        response.setHour(transformDateToHour(weatherAPI.getLocation().getLocaltime()));

        return response;
    }

    public static double transformDateToHour(String localtime) throws ParseException {
        Date actualDay = new SimpleDateFormat("yyyy-MM-dd").parse(localtime);
        Date actualDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(localtime);

        long secondsInDay = (actualDate.getTime() - actualDay.getTime()) / 1000;
        double dayDividedInThousand = (24 * 60 * 60) / 1000d;
        String formatHourInString = String.format("0.%d", (int) (secondsInDay / dayDividedInThousand));

        return Double.parseDouble(formatHourInString);
    }
}
