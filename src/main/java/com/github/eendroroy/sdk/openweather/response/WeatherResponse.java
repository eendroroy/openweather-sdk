package com.github.eendroroy.sdk.openweather.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author indrajit
 */

@ToString
@Setter
@Getter
@JsonRootName("weather")
public class WeatherResponse implements BaseResponse {
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("main")
    public String main;

    @JsonProperty("description")
    public String description;

    @JsonProperty("icon")
    public String icon;
}
