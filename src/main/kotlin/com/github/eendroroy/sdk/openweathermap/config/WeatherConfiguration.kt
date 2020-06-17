package com.github.eendroroy.sdk.openweathermap.config

/**
 * @author indrajit
 */
interface WeatherConfiguration {
    fun baseUrl(): String
    fun appId(): String
    fun acceptUnsafeSSL(): Boolean
}