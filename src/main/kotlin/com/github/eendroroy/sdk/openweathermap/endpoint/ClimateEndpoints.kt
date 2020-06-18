package com.github.eendroroy.sdk.openweathermap.endpoint

import com.github.eendroroy.sdk.openweathermap.response.ClimateResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author indrajit
 */
interface ClimateEndpoints {
    @GET("/data/2.5/climate/month")
    fun climateByCityName(
            @Query("q") cityName: String?,
            @Query("appid") apiKey: String?
    ): Call<ClimateResponse?>

    @GET("/data/2.5/climate/month")
    fun climateByCityId(
            @Query("id") cityId: String?,
            @Query("appid") apiKey: String?
    ): Call<ClimateResponse?>

    @GET("/data/2.5/climate/month")
    fun climateByCoOrd(
            @Query("lat") latitude: String?,
            @Query("lon") longitude: String?,
            @Query("appid") apiKey: String?
    ): Call<ClimateResponse?>

    @GET("/data/2.5/climate/month")
    fun climateByZip(
            @Query("zip") zipCode: String?,
            @Query("appid") apiKey: String?
    ): Call<ClimateResponse?>
}