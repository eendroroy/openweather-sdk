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
@JsonRootName("weathers")
public class FindWeatherResponse implements BaseResponse {
    @JsonProperty("cod")
    public Integer cod;

    @JsonProperty("message")
    public String message;

    @JsonProperty("count")
    public Integer count;


    @JsonProperty("list")
    public List<GetWeatherResponse> weathers;
}
