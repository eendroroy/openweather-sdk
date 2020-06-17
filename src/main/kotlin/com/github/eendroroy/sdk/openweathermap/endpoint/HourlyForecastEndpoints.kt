package com.github.eendroroy.sdk.openweathermap.endpoint

import com.github.eendroroy.sdk.openweathermap.response.HourlyForecastResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author indrajit
 */
interface HourlyForecastEndpoints {
    @GET("data/2.5/forecast/hourly")
    fun hourlyForecastByCityName(
            @Query("q") cityName: String?,
            @Query("appid") apiKey: String?
    ): Call<HourlyForecastResponse?>

    @GET("data/2.5/forecast/hourly")
    fun hourlyForecastByCityId(
            @Query("id") cityId: String?,
            @Query("appid") apiKey: String?
    ): Call<HourlyForecastResponse?>

    @GET("data/2.5/forecast/hourly")
    fun hourlyForecastByCoOrd(
            @Query("lat") latitude: String?,
            @Query("lon") longitude: String?,
            @Query("appid") apiKey: String?
    ): Call<HourlyForecastResponse?>

    @GET("data/2.5/forecast/hourly")
    fun hourlyForecastByZip(
            @Query("zip") zipCode: String?,
            @Query("appid") apiKey: String?
    ): Call<HourlyForecastResponse?>
}