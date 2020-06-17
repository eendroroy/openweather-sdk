package com.github.eendroroy.sdk.openweathermap.api

import com.github.eendroroy.sdk.openweathermap.ClientFactory
import com.github.eendroroy.sdk.openweathermap.api.test.support.LoggingInterceptor
import com.github.eendroroy.sdk.openweathermap.interceptor.OWInterceptor
import java.io.IOException

/**
 * @author indrajit
 */
internal object DailyForecastClientTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val interceptor: OWInterceptor = LoggingInterceptor()
        val client = ClientFactory().with(interceptor).dailyForecastClient
        try {
            val response1 = client.dailyForecastByCityName("London")
            println(response1.toString())
            val response2 = client.dailyForecastByCityName("London", "London")
            println(response2.toString())
            val response3 = client.dailyForecastByCityName("London", "London", "uk")
            println(response3.toString())
            val response4 = client.dailyForecastByCityId("2172797")
            println(response4.toString())
            val response5 = client.dailyForecastByCoOrd("35", "139")
            println(response5.toString())
            val response6 = client.dailyForecastByZip("94040", "us")
            println(response6.toString())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}