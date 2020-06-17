package com.github.eendroroy.sdk.openweathermap.response.embedded

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("sys")
data class Sys(
        @JsonProperty("type") val type: Int?,
        @JsonProperty("id") val id: Int?,
        @JsonProperty("message") val message: Double?,
        @JsonProperty("country") val country: String?,
        @JsonProperty("sunrise") val sunrise: Int?,
        @JsonProperty("sunset") val sunset: Int?,
        @JsonProperty("pod") val pod: String?
)