package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonRootName("weathers")
class FindWeatherResponse : BaseResponse {
    @JsonProperty("cod")
    var cod: Int? = null

    @JsonProperty("message")
    var message: String? = null

    @JsonProperty("count")
    var count: Int? = null

    @JsonProperty("list")
    var weathers: List<GetWeatherResponse>? = null
}