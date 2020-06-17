package com.github.eendroroy.sdk.openweathermap.api

import com.github.eendroroy.sdk.openweathermap.ClientFactory
import com.github.eendroroy.sdk.openweathermap.Unit
import com.github.eendroroy.sdk.openweathermap.api.test.support.LoggingInterceptor
import com.github.eendroroy.sdk.openweathermap.interceptor.OWInterceptor
import java.io.IOException

/**
 * @author indrajit
 */
internal object OWClientTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val interceptor: OWInterceptor = LoggingInterceptor()
        val client = ClientFactory().with(interceptor).weatherClient()
        try {
            val response1 = client.weatherByCityName("London")
            print(response1.toString())
            print(response1!!.weather!![0].iconUrl())
            val response2 = client.weatherByCityName("London", "London")
            print(response2.toString())
            print(response2!!.weather!![0].iconUrl())
            val response3 = client.weatherByCityName("London", "London", "uk")
            print(response3.toString())
            print(response3!!.weather!![0].iconUrl())
            val response4 = client.weatherByCityId("2172797")
            print(response4.toString())
            print(response4!!.weather!![0].iconUrl())
            val response5 = client.weatherByCoOrd("35", "139")
            print(response5.toString())
            print(response5!!.weather!![0].iconUrl())
            val response6 = client.weatherByZip("94040", "us")
            print(response6.toString())
            print(response6!!.weather!![0].iconUrl())
            val response7 = client.weatherByCityName("London", Unit.IMPERIAL)
            print(response7.toString())
            print(response7!!.weathers!![0].weather!![0].iconUrl())
            val response8 = client.weatherByCityName("London", "London", Unit.IMPERIAL)
            print(response8.toString())
            print(response8!!.weathers!![0].weather!![0].iconUrl())
            val response9 = client.weatherByCityName("London", "London", "uk", Unit.IMPERIAL)
            print(response9.toString())
            print(response9!!.weathers!![0].weather!![0].iconUrl())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}