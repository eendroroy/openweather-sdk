package com.github.eendroroy.sdk.openweather.config;

/**
 * @author indrajit
 */

public class DefaultWeatherConfiguration implements WeatherConfiguration {
    @Override
    public String getBaseUrl() {
        return "https://samples.openweathermap.org/";
    }

    @Override
    public String getAppId() {
        return "439d4b804bc8187953eb36d2a8c26a02";
    }
}
