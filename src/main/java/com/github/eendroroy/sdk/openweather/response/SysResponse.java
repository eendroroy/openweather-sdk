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
@JsonRootName("sys")
public class SysResponse implements BaseResponse {
    @JsonProperty("type")
    public Integer type;

    @JsonProperty("id")
    public Integer id;

    @JsonProperty("message")
    public Double message;

    @JsonProperty("country")
    public String country;

    @JsonProperty("sunrise")
    public Integer sunrise;

    @JsonProperty("sunset")
    public Integer sunset;}
