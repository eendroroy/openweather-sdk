package com.github.eendroroy.sdk.openweather.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author indrajit
 */

@ToString
@Setter
@Getter
@JsonRootName("weather")
public class GetWeatherResponse implements BaseResponse {
    @JsonProperty("coord")
    public CoOrdResponse coOrd;

    @JsonProperty("weather")
    public List<WeatherResponse> weather = null;

    @JsonProperty("base")
    public String base;

    @JsonProperty("main")
    public MainResponse main;

    @JsonProperty("visibility")
    public Integer visibility;

    @JsonProperty("wind")
    public WindResponse wind;

    @JsonProperty("clouds")
    public CloudsResponse clouds;

    @JsonProperty("dt")
    public Integer dt;

    @JsonProperty("sys")
    public SysResponse sys;

    @JsonProperty("timezone")
    public Integer timezone;

    @JsonProperty("id")
    public Integer id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("cod")
    public Integer cod;

    @JsonProperty("message")
    public String message;
}
