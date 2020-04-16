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
@JsonRootName("main")
public class MainResponse implements BaseResponse {
    @JsonProperty("temp")
    public Float temp;

    @JsonProperty("feels_like")
    public Float feelsLike;

    @JsonProperty("temp_min")
    public Float tempMin;

    @JsonProperty("temp_max")
    public Float tempMax;

    @JsonProperty("pressure")
    public Integer pressure;

    @JsonProperty("humidity")
    public Integer humidity;
}
