package com.github.eendroroy.sdk.openweathermap.endpoint

import com.github.eendroroy.sdk.openweathermap.response.OneCallResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author indrajit
 */
interface OneCallEndpoints {
    @GET("/data/2.5/onecall")
    fun oneCallByCoOrd(
            @Query("lat") latitude: String?,
            @Query("lon") longitude: String?,
            @Query("exclude") exclude: String?,
            @Query("lang") lang: String?,
            @Query("units") unit: String?,
            @Query("appid") apiKey: String?
    ): Call<OneCallResponse?>

    @GET("/data/2.5/onecall/timemachine")
    fun timeMachineByCoOrd(
            @Query("lat") latitude: String?,
            @Query("lon") longitude: String?,
            @Query("dt") timestamp: String?,
            @Query("exclude") exclude: String?,
            @Query("lang") lang: String?,
            @Query("units") unit: String?,
            @Query("appid") apiKey: String?
    ): Call<OneCallResponse?>
}