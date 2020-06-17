package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("weathers")
data class FindWeatherResponse(
        @JsonProperty("cod")     var cod: Int?,
        @JsonProperty("message") var message: String?,
        @JsonProperty("count")   var count: Int?,
        @JsonProperty("list")    var weathers: List<GetWeatherResponse>?
) : BaseResponse {
    override var httpCode: String? = null
    override var httpMessage: String? = null
}