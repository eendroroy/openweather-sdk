package com.github.eendroroy.sdk.openweathermap.config

/**
 * @author indrajit
 */
class DefaultWeatherConfiguration : WeatherConfiguration {
    override fun baseUrl(): String {
        return "https://samples.openweathermap.org/"
    }

    override fun appId(): String {
        return "439d4b804bc8187953eb36d2a8c26a02"
    }
}