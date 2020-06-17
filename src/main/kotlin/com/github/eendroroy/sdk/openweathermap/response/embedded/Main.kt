package com.github.eendroroy.sdk.openweathermap.response.embedded

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("main")
data class Main(
        @JsonProperty("temp") val temp: Double?,
        @JsonProperty("feels_like") val feelsLike: Double?,
        @JsonProperty("temp_min") val tempMin: Double?,
        @JsonProperty("temp_max") val tempMax: Double?,
        @JsonProperty("pressure") val pressure: Int?,
        @JsonProperty("humidity") val humidity: Int?,
        @JsonProperty("sea_level") val seaLevel: Double?,
        @JsonProperty("grnd_level") val groundLevel: Double?,
        @JsonProperty("temp_kf") val tempKf: Double?
)