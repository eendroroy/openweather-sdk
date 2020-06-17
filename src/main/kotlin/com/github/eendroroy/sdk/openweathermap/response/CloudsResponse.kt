package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonRootName("clouds")
class CloudsResponse : BaseResponse {
    @JsonProperty("all")
    var all: Int? = null
}