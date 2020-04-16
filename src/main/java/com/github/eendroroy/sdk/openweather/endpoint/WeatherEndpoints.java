package com.github.eendroroy.sdk.openweather.endpoint;

import com.github.eendroroy.sdk.openweather.response.FindWeatherResponse;
import com.github.eendroroy.sdk.openweather.response.GetWeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author indrajit
 */

public interface WeatherEndpoints {
    @GET("/data/2.5/weather")
    Call<GetWeatherResponse> weatherByCityName(
            @Query("q") String cityName,
            @Query("appid") String apiKey
    );

    @GET("/data/2.5/weather")
    Call<GetWeatherResponse> weatherByCityId(
            @Query("id") String cityId,
            @Query("appid") String apiKey
    );

    @GET("/data/2.5/weather")
    Call<GetWeatherResponse> weatherByCoOrd(
            @Query("lat") String latitude,
            @Query("lon") String longitude,
            @Query("appid") String apiKey
    );

    @GET("/data/2.5/weather")
    Call<GetWeatherResponse> weatherByZip(
            @Query("zip") String zipCode,
            @Query("appid") String apiKey
    );

    @GET("/data/2.5/find")
    Call<FindWeatherResponse> weatherByCityName(
            @Query("q") String cityName,
            @Query("appid") String apiKey,
            @Query("units") String unit
    );
}
