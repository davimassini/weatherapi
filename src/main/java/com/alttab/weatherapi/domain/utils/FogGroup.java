package com.alttab.weatherapi.domain.utils;

import com.alttab.weatherapi.domain.enums.FogConditionEnum;

import java.util.HashMap;
import java.util.Map;

public class FogGroup {
    private FogGroup() {
        throw new IllegalStateException("Utility class");
    }

    protected static final Map<Integer, FogConditionEnum> codeToGroup;

    static {
        codeToGroup = new HashMap<>();

        codeToGroup.put(1030, FogConditionEnum.MIST);

        codeToGroup.put(1135, FogConditionEnum.FOG);
    }

    public static FogConditionEnum groupFogCondition(int code) {
        return codeToGroup.get(code) != null ? codeToGroup.get(code) : FogConditionEnum.UNDEFINED;
    }
}
