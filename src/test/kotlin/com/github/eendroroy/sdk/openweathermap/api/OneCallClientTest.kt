package com.github.eendroroy.sdk.openweathermap.api

import com.github.eendroroy.sdk.openweathermap.ClientFactory
import com.github.eendroroy.sdk.openweathermap.api.test.support.LoggingInterceptor
import com.github.eendroroy.sdk.openweathermap.api.test.support.ProConf
import com.github.eendroroy.sdk.openweathermap.interceptor.OWInterceptor
import org.joda.time.DateTime
import java.io.IOException
import java.sql.Timestamp

/**
 * @author indrajit
 */
internal object OneCallClientTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val interceptor: OWInterceptor = LoggingInterceptor()
        val client = ClientFactory().with(interceptor).with(ProConf()).oneCallClient
        try {
            val response1 = client.timeMachineByCoOrd(35.0, 139.0, Timestamp(DateTime.now().millis))
            println(response1.toString())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}