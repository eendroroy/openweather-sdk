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
        @JsonProperty("temp")       var temp: Float?,
        @JsonProperty("feels_like") var feelsLike: Float?,
        @JsonProperty("temp_min")   var tempMin: Float?,
        @JsonProperty("temp_max")   var tempMax: Float?,
        @JsonProperty("pressure")   var pressure: Int?,
        @JsonProperty("humidity")   var humidity: Int?
)