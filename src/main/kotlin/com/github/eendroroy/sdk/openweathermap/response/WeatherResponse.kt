package com.github.eendroroy.sdk.openweathermap.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonRootName("weather")
class WeatherResponse : BaseResponse {
    @JsonProperty("id")
    var id: Int? = null

    @JsonProperty("main")
    var main: String? = null

    @JsonProperty("description")
    var description: String? = null

    @JsonProperty("icon")
    var icon: String? = null

    @JsonProperty("icon_url")
    fun iconUrl(): String {
        return "http://openweathermap.org/img/wn/$icon@2x.png"
    }
}