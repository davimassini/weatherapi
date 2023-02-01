package com.alttab.weatherapi.domain.utils;

import com.alttab.weatherapi.domain.enums.WeatherConditionEnum;

import java.util.Map;
import java.util.HashMap;

public class WeatherGroup {

    private WeatherGroup() {
        throw new IllegalStateException("Utility class");
    }

    protected static final Map<Integer, WeatherConditionEnum> codeToGroup;

    static {
        codeToGroup = new HashMap<>();

        codeToGroup.put(1000, WeatherConditionEnum.CLEAR);
        codeToGroup.put(1003, WeatherConditionEnum.CLEAR);
        codeToGroup.put(1006, WeatherConditionEnum.CLEAR);
        codeToGroup.put(1009, WeatherConditionEnum.CLEAR);
        codeToGroup.put(1030, WeatherConditionEnum.CLEAR);
        codeToGroup.put(1135, WeatherConditionEnum.CLEAR);
        codeToGroup.put(1114, WeatherConditionEnum.CLEAR);
        codeToGroup.put(1117, WeatherConditionEnum.CLEAR);

        codeToGroup.put(1150, WeatherConditionEnum.LIGHT_RAIN);
        codeToGroup.put(1153, WeatherConditionEnum.LIGHT_RAIN);
        codeToGroup.put(1183, WeatherConditionEnum.LIGHT_RAIN);
        codeToGroup.put(1240, WeatherConditionEnum.LIGHT_RAIN);
        codeToGroup.put(1204, WeatherConditionEnum.LIGHT_RAIN);
        codeToGroup.put(1213, WeatherConditionEnum.LIGHT_RAIN);

        codeToGroup.put(1063, WeatherConditionEnum.MODERATE_RAIN);
        codeToGroup.put(1216, WeatherConditionEnum.MODERATE_RAIN);
        codeToGroup.put(1186, WeatherConditionEnum.MODERATE_RAIN);
        codeToGroup.put(1189, WeatherConditionEnum.MODERATE_RAIN);
        codeToGroup.put(1219, WeatherConditionEnum.MODERATE_RAIN);

        codeToGroup.put(1222, WeatherConditionEnum.HEAVY_RAIN);
        codeToGroup.put(1192, WeatherConditionEnum.HEAVY_RAIN);
        codeToGroup.put(1195, WeatherConditionEnum.HEAVY_RAIN);
        codeToGroup.put(1225, WeatherConditionEnum.HEAVY_RAIN);
        codeToGroup.put(1246, WeatherConditionEnum.HEAVY_RAIN);

        codeToGroup.put(1273, WeatherConditionEnum.THUNDER_RAIN);
        codeToGroup.put(1276, WeatherConditionEnum.THUNDER_RAIN);
    }

    public static WeatherConditionEnum groupWeatherCondition(int code) {
        return codeToGroup.get(code);
    }
}
