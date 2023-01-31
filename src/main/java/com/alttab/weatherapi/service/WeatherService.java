package com.alttab.weatherapi.service;

import com.alttab.weatherapi.domain.dto.WeatherDto;
import com.alttab.weatherapi.domain.rest.WeatherAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherService {

    private WeatherService() {
        throw new IllegalStateException("Utility class");
    }

    public static WeatherDto getWeather(WeatherAPI weatherAPI) throws ParseException {
        WeatherDto response = new WeatherDto();
        response.setHour(dateToHour(weatherAPI.getLocation().getLocaltime()));
        response.setWind(windKphToScale(weatherAPI.getCurrent().getWind_kph()));

        return response;
    }

    private static double dateToHour(String localtime) throws ParseException {
        Date actualDay = new SimpleDateFormat("yyyy-MM-dd").parse(localtime);
        Date actualDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(localtime);

        long secondsInDay = (actualDate.getTime() - actualDay.getTime()) / 1000;
        double dayDividedInThousand = (24 * 60 * 60) / 1000d;
        String formatHourInString = String.format("0.%d", (int) (secondsInDay / dayDividedInThousand));

        return Double.parseDouble(formatHourInString);
    }

    private static double windKphToScale(double windKph) {
        int maxWindKph = 61;
        double windInScale = windKph / maxWindKph;
        String removeWindDecimalPlaces = String.format("%.3g", windInScale).replace(",", ".");

        return Double.parseDouble(removeWindDecimalPlaces);
    }
}
