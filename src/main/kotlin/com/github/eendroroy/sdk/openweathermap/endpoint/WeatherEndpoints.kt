package com.github.eendroroy.sdk.openweathermap.endpoint

import com.github.eendroroy.sdk.openweathermap.response.FindWeatherResponse
import com.github.eendroroy.sdk.openweathermap.response.GetWeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author indrajit
 */
interface WeatherEndpoints {
    @GET("/data/2.5/weather")
    fun weatherByCityName(
            @Query("q") cityName: String?,
            @Query("appid") apiKey: String?
    ): Call<GetWeatherResponse?>

    @GET("/data/2.5/weather")
    fun weatherByCityId(
            @Query("id") cityId: String?,
            @Query("appid") apiKey: String?
    ): Call<GetWeatherResponse?>

    @GET("/data/2.5/weather")
    fun weatherByCoOrd(
            @Query("lat") latitude: String?,
            @Query("lon") longitude: String?,
            @Query("appid") apiKey: String?
    ): Call<GetWeatherResponse?>

    @GET("/data/2.5/weather")
    fun weatherByZip(
            @Query("zip") zipCode: String?,
            @Query("appid") apiKey: String?
    ): Call<GetWeatherResponse?>

    @GET("/data/2.5/find")
    fun weatherByCityName(
            @Query("q") cityName: String?,
            @Query("appid") apiKey: String?,
            @Query("units") unit: String?
    ): Call<FindWeatherResponse?>
}