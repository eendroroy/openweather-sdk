package com.github.eendroroy.sdk.openweathermap.response.embedded

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("weather")
data class Weather(
        @JsonProperty("id") val id: Int?,
        @JsonProperty("main") val main: String?,
        @JsonProperty("description") val description: String?,
        @JsonProperty("icon") val icon: String?
) {
    val iconUrl: String
        @JsonProperty("icon_url")
        get() {
            return "http://openweathermap.org/img/wn/$icon@2x.png"
        }
}