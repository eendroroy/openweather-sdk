package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName
import com.github.eendroroy.sdk.openweathermap.response.embedded.*

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("weather")
data class GetWeatherResponse(
        @JsonProperty("coord")      var coOrd: CoOrd?,
        @JsonProperty("base")       var base: String?,
        @JsonProperty("main")       var main: Main?,
        @JsonProperty("visibility") var visibility: Int?,
        @JsonProperty("wind")       var wind: Wind?,
        @JsonProperty("clouds")     var clouds: Clouds?,
        @JsonProperty("dt")         var dt: Int?,
        @JsonProperty("sys")        var sys: Sys?,
        @JsonProperty("timezone")   var timezone: Int?,
        @JsonProperty("id")         var id: Int?,
        @JsonProperty("name")       var name: String?,
        @JsonProperty("cod")        var cod: Int?,
        @JsonProperty("message")    var message: String?,
        @JsonProperty("weather")    var weather: List<Weather>?
) : BaseResponse {
    override var httpCode: String? = null
    override var httpMessage: String? = null
}