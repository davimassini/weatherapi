package com.alttab.weatherapi.domain.dto;

public class WeatherDto {
    private double hour;
    private double rain;
    private double wind;
    private double fog;
    private double lightning;
    private double tempCelsius;
    private String date;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getWind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }

    public double getFog() {
        return fog;
    }

    public void setFog(double fog) {
        this.fog = fog;
    }

    public double getLightning() {
        return lightning;
    }

    public void setLightning(double lightning) {
        this.lightning = lightning;
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}