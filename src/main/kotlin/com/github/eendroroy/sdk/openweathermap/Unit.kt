package com.github.eendroroy.sdk.openweathermap

/**
 * @author indrajit
 */
enum class Unit(private val value: String) {
    STANDARD("standard"), METRIC("metric"), IMPERIAL("imperial");

    override fun toString(): String {
        return value
    }

    fun value(): String {
        return value
    }

}