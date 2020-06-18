package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName
import com.github.eendroroy.sdk.openweathermap.response.embedded.City
import com.github.eendroroy.sdk.openweathermap.response.embedded.ForecastClimate

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("weather")
data class ClimateResponse(
        @JsonProperty("cod") val cod: Int?,
        @JsonProperty("city") val city: City?,
        @JsonProperty("message") val message: Double?,
        @JsonProperty("list") val list: List<ForecastClimate>?
) : BaseResponse {
    override var httpCode: Int? = null
    override var httpMessage: String? = null
}