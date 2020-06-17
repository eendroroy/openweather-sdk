package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonRootName("wind")
class WindResponse : BaseResponse {
    @JsonProperty("speed")
    var speed: Double? = null

    @JsonProperty("deg")
    var deg: Int? = null
}