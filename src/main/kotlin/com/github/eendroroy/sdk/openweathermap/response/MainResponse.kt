package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonRootName("main")
class MainResponse : BaseResponse {
    @JsonProperty("temp")
    var temp: Float? = null

    @JsonProperty("feels_like")
    var feelsLike: Float? = null

    @JsonProperty("temp_min")
    var tempMin: Float? = null

    @JsonProperty("temp_max")
    var tempMax: Float? = null

    @JsonProperty("pressure")
    var pressure: Int? = null

    @JsonProperty("humidity")
    var humidity: Int? = null
}