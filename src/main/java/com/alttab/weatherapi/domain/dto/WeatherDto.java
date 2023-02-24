package com.alttab.weatherapi.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDto {

    private LocationDto locationDto;
    private CurrentDto currentDto;

    public LocationDto getLocation() {
        return locationDto;
    }

    public void setLocation(LocationDto locationDto) {
        this.locationDto = locationDto;
    }

    public CurrentDto getCurrent() {
        return currentDto;
    }

    public void setCurrent(CurrentDto currentDto) {
        this.currentDto = currentDto;
    }
}