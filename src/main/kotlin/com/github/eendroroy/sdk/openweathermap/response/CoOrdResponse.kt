package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonRootName("coord")
class CoOrdResponse : BaseResponse {
    @JsonProperty("lon")
    var lon: Double? = null

    @JsonProperty("lat")
    var lat: Double? = null
}