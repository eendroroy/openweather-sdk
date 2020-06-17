package com.github.eendroroy.sdk.openweathermap.endpoint

import com.github.eendroroy.sdk.openweathermap.response.DailyForecastResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author indrajit
 */
interface DailyForecastEndpoints {
    @GET("data/2.5/forecast/daily")
    fun dailyForecastByCityName(
            @Query("q") cityName: String?,
            @Query("appid") apiKey: String?
    ): Call<DailyForecastResponse?>

    @GET("data/2.5/forecast/daily")
    fun dailyForecastByCityId(
            @Query("id") cityId: String?,
            @Query("appid") apiKey: String?
    ): Call<DailyForecastResponse?>

    @GET("data/2.5/forecast/daily")
    fun dailyForecastByCoOrd(
            @Query("lat") latitude: String?,
            @Query("lon") longitude: String?,
            @Query("appid") apiKey: String?
    ): Call<DailyForecastResponse?>

    @GET("data/2.5/forecast/daily")
    fun dailyForecastByZip(
            @Query("zip") zipCode: String?,
            @Query("appid") apiKey: String?
    ): Call<DailyForecastResponse?>
}