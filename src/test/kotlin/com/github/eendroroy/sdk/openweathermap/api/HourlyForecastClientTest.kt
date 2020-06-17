package com.github.eendroroy.sdk.openweathermap.api

import com.github.eendroroy.sdk.openweathermap.ClientFactory
import com.github.eendroroy.sdk.openweathermap.api.test.support.LoggingInterceptor
import com.github.eendroroy.sdk.openweathermap.interceptor.OWInterceptor
import java.io.IOException

/**
 * @author indrajit
 */
internal object HourlyForecastClientTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val interceptor: OWInterceptor = LoggingInterceptor()
        val client = ClientFactory().with(interceptor).hourlyForecastClient
        try {
            val response1 = client.hourlyForecastByCityName("London")
            println(response1.toString())
            val response2 = client.hourlyForecastByCityName("London", "London")
            println(response2.toString())
            val response3 = client.hourlyForecastByCityName("London", "London", "uk")
            println(response3.toString())
            val response4 = client.hourlyForecastByCityId("2172797")
            println(response4.toString())
            val response5 = client.hourlyForecastByCoOrd("35", "139")
            println(response5.toString())
            val response6 = client.hourlyForecastByZip("94040", "us")
            println(response6.toString())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}