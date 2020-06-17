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
        @JsonProperty("type")    var type: Int?,
        @JsonProperty("id")      var id: Int?,
        @JsonProperty("message") var message: Double?,
        @JsonProperty("country") var country: String?,
        @JsonProperty("sunrise") var sunrise: Int?,
        @JsonProperty("sunset")  var sunset: Int?
)