package com.github.eendroroy.sdk.openweathermap.definition

/**
 * @author indrajit
 */
enum class OneCallPart(private val value: String) {
    CURRENT("current"), MINUTELY("minutely"), HOURLY("hourly"), DAILY("daily");

    override fun toString(): String {
        return value()
    }

    fun value(): String {
        return value
    }

}