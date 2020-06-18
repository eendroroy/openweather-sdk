package com.github.eendroroy.sdk.openweathermap.response.embedded

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("list")
data class ForecastHourly(
        @JsonProperty("dt") val dt: Int?,
        @JsonProperty("main") val main: Main?,
        @JsonProperty("weather") val weather: List<Weather>?,
        @JsonProperty("clouds") val clouds: Clouds?,
        @JsonProperty("wind") val wind: Wind?,
        @JsonProperty("sys") val sys: Sys?,
        @JsonProperty("dt_txt") val dt_txt: String?
)