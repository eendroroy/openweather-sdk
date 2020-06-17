package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonRootName("sys")
class SysResponse : BaseResponse {
    @JsonProperty("type")
    var type: Int? = null

    @JsonProperty("id")
    var id: Int? = null

    @JsonProperty("message")
    var message: Double? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("sunrise")
    var sunrise: Int? = null

    @JsonProperty("sunset")
    var sunset: Int? = null
}