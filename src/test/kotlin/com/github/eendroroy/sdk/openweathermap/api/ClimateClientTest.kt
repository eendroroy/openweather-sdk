package com.github.eendroroy.sdk.openweathermap.api

import com.github.eendroroy.sdk.openweathermap.ClientFactory
import com.github.eendroroy.sdk.openweathermap.api.test.support.LoggingInterceptor
import com.github.eendroroy.sdk.openweathermap.api.test.support.ProConf
import com.github.eendroroy.sdk.openweathermap.interceptor.OWInterceptor
import java.io.IOException

/**
 * @author indrajit
 */
internal object ClimateClientTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val interceptor: OWInterceptor = LoggingInterceptor()
        val client = ClientFactory().with(interceptor).with(ProConf()).climateClient
        try {
            val response1 = client.climateByCityName("London")
            println(response1.toString())
            val response2 = client.climateByCityName("London", "London")
            println(response2.toString())
            val response3 = client.climateByCityName("London", "London", "uk")
            println(response3.toString())
            val response4 = client.climateByCityId("2172797")
            println(response4.toString())
            val response5 = client.climateByCoOrd("35", "139")
            println(response5.toString())
            val response6 = client.climateByZip("94040", "us")
            println(response6.toString())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}