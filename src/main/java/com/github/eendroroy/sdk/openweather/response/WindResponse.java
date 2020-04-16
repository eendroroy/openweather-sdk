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
@JsonRootName("wind")
public class WindResponse implements BaseResponse {
    @JsonProperty("speed")
    public Double speed;

    @JsonProperty("deg")
    public Integer deg;
}
