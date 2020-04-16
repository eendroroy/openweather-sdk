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
@JsonRootName("coord")
public class CoOrdResponse implements BaseResponse {
    @JsonProperty("lon")
    public Double lon;

    @JsonProperty("lat")
    public Double lat;
}
