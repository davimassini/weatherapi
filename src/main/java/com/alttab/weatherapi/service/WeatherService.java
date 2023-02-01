package com.alttab.weatherapi.service;

import com.alttab.weatherapi.domain.dto.CurrentDto;
import com.alttab.weatherapi.domain.dto.LocationDto;
import com.alttab.weatherapi.domain.dto.WeatherDto;
import com.alttab.weatherapi.domain.rest.WeatherAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.alttab.weatherapi.domain.utils.FogGroup.groupFogCondition;
import static com.alttab.weatherapi.domain.utils.WeatherGroup.groupWeatherCondition;

public class WeatherService {

    private WeatherService() {
        throw new IllegalStateException("Utility class");
    }

    public static WeatherDto getWeather(WeatherAPI weatherAPI) throws ParseException {
        CurrentDto currentDto = weatherAPI.getCurrent();
        LocationDto locationDto = weatherAPI.getLocation();

        WeatherDto response = new WeatherDto();
        response.setHour(dateToHour(locationDto.getLocaltime()));
        response.setRain(codeToRain(currentDto.getCondition().getCode()));
        response.setWind(windKphToScale(currentDto.getWind_kph()));
        response.setFog(codeToFog(currentDto.getCondition().getCode()));
        response.setLightning(codeToLightning(currentDto.getCondition().getCode()));
        response.setTempCelsius(currentDto.getTemp_c());
        response.setDate(formatDate(locationDto.getLocaltime_epoch()));

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

    private static double codeToRain(int code) {
        return switch (groupWeatherCondition(code)) {
            case CLEAR -> 0;
            case LIGHT_RAIN -> 0.3;
            case MODERATE_RAIN -> 0.5;
            case HEAVY_RAIN -> 0.85;
            case THUNDER_RAIN -> 1;
        };
    }

    private static double windKphToScale(double windKph) {
        int maxWindKph = 61;
        double windInScale = windKph / maxWindKph;
        String removeWindDecimalPlaces = String.format("%.3g", windInScale).replace(",", ".");

        return Double.parseDouble(removeWindDecimalPlaces);
    }

    private static double codeToFog(int code) {
        return switch (groupFogCondition(code)) {
            case MIST -> 0.5;
            case FOG -> 1;
        };
    }

    private static double codeToLightning(int code) {
        return switch (code) {
            case 1273 -> 0.5;
            case 1276 -> 1;
            default -> 0.0;
        };
    }

    private static String formatDate(int date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(new Date((long) date * 1000));
    }
}
