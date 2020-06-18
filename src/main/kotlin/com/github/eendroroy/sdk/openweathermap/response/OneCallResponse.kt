package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName
import com.github.eendroroy.sdk.openweathermap.response.embedded.Current
import com.github.eendroroy.sdk.openweathermap.response.embedded.Daily
import com.github.eendroroy.sdk.openweathermap.response.embedded.Hourly

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("weather")
data class OneCallResponse(
        @JsonProperty("lat") val lat : Int?,
        @JsonProperty("lon") val lon : Int?,
        @JsonProperty("timezone") val timezone : String?,
        @JsonProperty("timezone_offset") val timezoneOffset : Int?,
        @JsonProperty("current") val current : Current?,
        @JsonProperty("hourly") val hourly : List<Hourly>?,
        @JsonProperty("daily") val daily : List<Daily>?
) : BaseResponse {
    override var httpCode: Int? = null
    override var httpMessage: String? = null
}