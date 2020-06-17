package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName
import com.github.eendroroy.sdk.openweathermap.response.embedded.City
import com.github.eendroroy.sdk.openweathermap.response.embedded.ForecastListDaily

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("weather")
data class DailyForecastResponse(
        @JsonProperty("cod") val cod: Int?,
        @JsonProperty("message") val message: Double?,
        @JsonProperty("cnt") val cnt: Int?,
        @JsonProperty("list") val list: List<ForecastListDaily>?,
        @JsonProperty("city") val city: City?
) : BaseResponse {
    override var httpCode: String? = null
    override var httpMessage: String? = null
}