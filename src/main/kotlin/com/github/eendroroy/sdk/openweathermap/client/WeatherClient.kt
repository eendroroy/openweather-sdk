package com.github.eendroroy.sdk.openweathermap.client

import com.github.eendroroy.sdk.openweathermap.config.OWConfiguration
import com.github.eendroroy.sdk.openweathermap.converter.ResponseConverter
import com.github.eendroroy.sdk.openweathermap.definition.WeatherUnit
import com.github.eendroroy.sdk.openweathermap.endpoint.WeatherEndpoints
import com.github.eendroroy.sdk.openweathermap.response.FindWeatherResponse
import com.github.eendroroy.sdk.openweathermap.response.GetWeatherResponse
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException

/**
 * @author indrajit
 */
class WeatherClient(
        private val retrofit: Retrofit,
        private val OWConfiguration: OWConfiguration
) {
    private val endpoints: WeatherEndpoints = retrofit.create(WeatherEndpoints::class.java)

    @Throws(IOException::class)
    fun weatherByCityName(cityName: String?): GetWeatherResponse? {
        val response: Response<GetWeatherResponse?> = endpoints.weatherByCityName(
                cityName, OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(IOException::class)
    fun weatherByCityName(cityName: String?, weatherUnit: WeatherUnit): FindWeatherResponse? {
        val response: Response<FindWeatherResponse?> = endpoints.weatherByCityName(
                cityName, OWConfiguration.appId(), weatherUnit.toString()
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(IOException::class)
    fun weatherByCityName(cityName: String, state: String, weatherUnit: WeatherUnit): FindWeatherResponse? {
        val response: Response<FindWeatherResponse?> = endpoints.weatherByCityName(
                "$cityName,$state", OWConfiguration.appId(), weatherUnit.toString()
        ).execute()
        val responseBody: FindWeatherResponse? = ResponseConverter(retrofit, response).convert()
        return responseBody
    }

    @Throws(IOException::class)
    fun weatherByCityName(cityName: String, state: String): GetWeatherResponse? {
        val response: Response<GetWeatherResponse?> = endpoints.weatherByCityName(
                "$cityName,$state", OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(IOException::class)
    fun weatherByCityName(
            cityName: String, state: String, countryCode: String, weatherUnit: WeatherUnit
    ): FindWeatherResponse? {
        val response: Response<FindWeatherResponse?> = endpoints.weatherByCityName(
                "$cityName,$state,$countryCode", OWConfiguration.appId(), weatherUnit.toString()
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(IOException::class)
    fun weatherByCityName(cityName: String, state: String, countryCode: String): GetWeatherResponse? {
        val response: Response<GetWeatherResponse?> = endpoints.weatherByCityName(
                "$cityName,$state,$countryCode", OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(IOException::class)
    fun weatherByCityId(cityId: String?): GetWeatherResponse? {
        val response: Response<GetWeatherResponse?> = endpoints.weatherByCityId(
                cityId, OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(IOException::class)
    fun weatherByCoOrd(latitude: String?, longitude: String?): GetWeatherResponse? {
        val response: Response<GetWeatherResponse?> = endpoints.weatherByCoOrd(
                latitude, longitude, OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(IOException::class)
    fun weatherByZip(zipCode: String, countryCode: String): GetWeatherResponse? {
        val response: Response<GetWeatherResponse?> = endpoints.weatherByZip(
                "$zipCode,$countryCode", OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }
}