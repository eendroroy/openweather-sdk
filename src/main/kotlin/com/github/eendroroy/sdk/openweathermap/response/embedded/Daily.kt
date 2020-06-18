package com.github.eendroroy.sdk.openweathermap.response.embedded

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("weather")
data class Daily(
        @JsonProperty("dt") val dt : Int,
        @JsonProperty("sunrise") val sunrise : Int,
        @JsonProperty("sunset") val sunset : Int,
        @JsonProperty("temp") val temperature : Temperature2,
        @JsonProperty("feels_like") val feelsLike : FeelsLike,
        @JsonProperty("pressure") val pressure : Int,
        @JsonProperty("humidity") val humidity : Int,
        @JsonProperty("dew_point") val dewPoint : Double,
        @JsonProperty("wind_speed") val windSpeed : Double,
        @JsonProperty("wind_deg") val windDeg : Int,
        @JsonProperty("weather") val weather : List<Weather>,
        @JsonProperty("clouds") val clouds : Int,
        @JsonProperty("rain") val rain : Double,
        @JsonProperty("uvi") val uvi : Double
)