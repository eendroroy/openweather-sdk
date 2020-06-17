package com.github.eendroroy.sdk.openweathermap.definition

/**
 * @author indrajit
 */
enum class WeatherUnit(private val value: String) {
    STANDARD("standard"), METRIC("metric"), IMPERIAL("imperial");

    override fun toString(): String {
        return value()
    }

    fun value(): String {
        return value
    }

}