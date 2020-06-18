package com.github.eendroroy.sdk.openweathermap.response.embedded

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("temp")
data class Temperature2(
        @JsonProperty("day") val day : Double?,
        @JsonProperty("min") val min : Double?,
        @JsonProperty("max") val max : Double?,
        @JsonProperty("night") val night : Double?,
        @JsonProperty("eve") val eve : Double?,
        @JsonProperty("morn") val morn : Double?
)