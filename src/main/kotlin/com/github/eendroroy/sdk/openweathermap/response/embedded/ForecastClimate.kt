package com.github.eendroroy.sdk.openweathermap.response.embedded

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("list")
data class ForecastClimate(
        @JsonProperty("dt") val dt: Int?,
        @JsonProperty("humidity") val humidity: Double?,
        @JsonProperty("pressure") val pressure: Double?,
        @JsonProperty("temp") val temperature: Temperature?,
        @JsonProperty("wind_speed") val windSpeed: Double?
)