package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonRootName("weather")
class GetWeatherResponse : BaseResponse {
    @JsonProperty("coord")
    var coOrd: CoOrdResponse? = null

    @JsonProperty("weather")
    var weather: List<WeatherResponse>? = null

    @JsonProperty("base")
    var base: String? = null

    @JsonProperty("main")
    var main: MainResponse? = null

    @JsonProperty("visibility")
    var visibility: Int? = null

    @JsonProperty("wind")
    var wind: WindResponse? = null

    @JsonProperty("clouds")
    var clouds: CloudsResponse? = null

    @JsonProperty("dt")
    var dt: Int? = null

    @JsonProperty("sys")
    var sys: SysResponse? = null

    @JsonProperty("timezone")
    var timezone: Int? = null

    @JsonProperty("id")
    var id: Int? = null

    @JsonProperty("name")
    var name: String? = null

    @JsonProperty("cod")
    var cod: Int? = null

    @JsonProperty("message")
    var message: String? = null
}