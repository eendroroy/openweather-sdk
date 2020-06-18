package com.github.eendroroy.sdk.openweathermap.response.embedded

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("temp")
data class Temperature(
        @JsonProperty("average") val average: Double?,
        @JsonProperty("average_max") val averageMax: Double?,
        @JsonProperty("average_min") val averageMin: Double?,
        @JsonProperty("record_max") val recordMax: Double?,
        @JsonProperty("record_min") val recordMin: Double?
)