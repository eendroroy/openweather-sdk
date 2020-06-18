package com.github.eendroroy.sdk.openweathermap.client

import com.github.eendroroy.sdk.openweathermap.config.OWConfiguration
import com.github.eendroroy.sdk.openweathermap.converter.ResponseConverter
import com.github.eendroroy.sdk.openweathermap.definition.Language
import com.github.eendroroy.sdk.openweathermap.definition.OneCallPart
import com.github.eendroroy.sdk.openweathermap.definition.WeatherUnit
import com.github.eendroroy.sdk.openweathermap.endpoint.OneCallEndpoints
import com.github.eendroroy.sdk.openweathermap.response.OneCallResponse
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException
import java.sql.Timestamp

/**
 * @author indrajit
 */
class OneCallClient(
        private val retrofit: Retrofit,
        private val configuration: OWConfiguration
) {
    private val endpointsOneCall: OneCallEndpoints = retrofit.create(OneCallEndpoints::class.java)

    @Throws(IOException::class)
    fun oneCallByCoOrd(latitude: String?, longitude: String?): OneCallResponse? {
        return oneCallByCoOrd(latitude, longitude, null, null, null)
    }
    @Throws(IOException::class)
    fun oneCallByCoOrd(latitude: String?, longitude: String?, exclude: List<OneCallPart>?): OneCallResponse? {
        return oneCallByCoOrd(latitude, longitude, exclude, null, null)
    }
    @Throws(IOException::class)
    fun oneCallByCoOrd(latitude: String?, longitude: String?, lang: Language?, unit: WeatherUnit?): OneCallResponse? {
        return oneCallByCoOrd(latitude, longitude, null, lang, unit)
    }

    @Throws(IOException::class)
    fun oneCallByCoOrd(
            latitude: String?, longitude: String?, excludes: List<OneCallPart>?, lang: Language?, unit: WeatherUnit?
    ): OneCallResponse? {
        val exclude = excludes?.joinToString(",") { part -> part.value() }

        val responseHourly: Response<OneCallResponse?> = endpointsOneCall.oneCallByCoOrd(
                latitude, longitude, exclude,
                lang?.value() ?: Language.ENGLISH.value(),
                unit?.value() ?: WeatherUnit.STANDARD.value(),
                configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun timeMachineByCoOrd(latitude: String?, longitude: String?, timestamp: Timestamp): OneCallResponse? {
        return timeMachineByCoOrd(latitude, longitude, timestamp, null, null, null)
    }
    @Throws(IOException::class)
    fun timeMachineByCoOrd(latitude: String?, longitude: String?, timestamp: Timestamp, exclude: List<OneCallPart>?): OneCallResponse? {
        return timeMachineByCoOrd(latitude, longitude, timestamp, exclude, null, null)
    }
    @Throws(IOException::class)
    fun timeMachineByCoOrd(latitude: String?, longitude: String?, timestamp: Timestamp, lang: Language?, unit: WeatherUnit?): OneCallResponse? {
        return timeMachineByCoOrd(latitude, longitude, timestamp, null, lang, unit)
    }

    @Throws(IOException::class)
    fun timeMachineByCoOrd(
            latitude: String?, longitude: String?, timestamp: Timestamp, excludes: List<OneCallPart>?, lang: Language?, unit: WeatherUnit?
    ): OneCallResponse? {
        val exclude = excludes?.joinToString(",") { part -> part.value() }

        val responseHourly: Response<OneCallResponse?> = endpointsOneCall.timeMachineByCoOrd(
                latitude, longitude, (timestamp.time / 1_000).toString(), exclude,
                lang?.value() ?: Language.ENGLISH.value(),
                unit?.value() ?: WeatherUnit.STANDARD.value(),
                configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }
}