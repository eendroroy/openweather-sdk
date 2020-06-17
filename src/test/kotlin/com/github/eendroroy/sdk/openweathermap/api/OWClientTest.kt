package com.github.eendroroy.sdk.openweathermap.api

import com.github.eendroroy.sdk.openweathermap.ClientFactory
import com.github.eendroroy.sdk.openweathermap.api.test.support.LoggingInterceptor
import com.github.eendroroy.sdk.openweathermap.definition.WeatherUnit
import com.github.eendroroy.sdk.openweathermap.interceptor.OWInterceptor
import java.io.IOException

/**
 * @author indrajit
 */
internal object OWClientTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val interceptor: OWInterceptor = LoggingInterceptor()
        val client = ClientFactory().with(interceptor).weatherClient
        try {
            val response1 = client.weatherByCityName("London")
            println(response1.toString())
            println(response1!!.weather!![0].iconUrl)
            val response2 = client.weatherByCityName("London", "London")
            println(response2.toString())
            println(response2!!.weather!![0].iconUrl)
            val response3 = client.weatherByCityName("London", "London", "uk")
            println(response3.toString())
            println(response3!!.weather!![0].iconUrl)
            val response4 = client.weatherByCityId("2172797")
            println(response4.toString())
            println(response4!!.weather!![0].iconUrl)
            val response5 = client.weatherByCoOrd("35", "139")
            println(response5.toString())
            println(response5!!.weather!![0].iconUrl)
            val response6 = client.weatherByZip("94040", "us")
            println(response6.toString())
            println(response6!!.weather!![0].iconUrl)
            val response7 = client.weatherByCityName("London", WeatherUnit.IMPERIAL)
            println(response7.toString())
            println(response7!!.weathers!![0].weather!![0].iconUrl)
            val response8 = client.weatherByCityName("London", "London", WeatherUnit.IMPERIAL)
            println(response8.toString())
            println(response8!!.weathers!![0].weather!![0].iconUrl)
            val response9 = client.weatherByCityName("London", "London", "uk", WeatherUnit.IMPERIAL)
            println(response9.toString())
            println(response9!!.weathers!![0].weather!![0].iconUrl)
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}