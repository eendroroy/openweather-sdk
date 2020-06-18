package com.github.eendroroy.sdk.openweathermap.client

import com.github.eendroroy.sdk.openweathermap.config.OWConfiguration
import com.github.eendroroy.sdk.openweathermap.converter.ResponseConverter
import com.github.eendroroy.sdk.openweathermap.endpoint.HourlyForecastEndpoints
import com.github.eendroroy.sdk.openweathermap.response.HourlyForecastResponse
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException

/**
 * @author indrajit
 */
class HourlyForecastClient(
        private val retrofit: Retrofit,
        private val configuration: OWConfiguration
) {
    private val endpointsHourly: HourlyForecastEndpoints = retrofit.create(HourlyForecastEndpoints::class.java)

    @Throws(IOException::class)
    fun hourlyForecastByCityName(cityName: String?): HourlyForecastResponse? {
        val responseHourly: Response<HourlyForecastResponse?> = endpointsHourly.hourlyForecastByCityName(
                cityName, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun hourlyForecastByCityName(cityName: String, state: String): HourlyForecastResponse? {
        val responseHourly: Response<HourlyForecastResponse?> = endpointsHourly.hourlyForecastByCityName(
                "$cityName,$state", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun hourlyForecastByCityName(cityName: String, state: String, countryCode: String): HourlyForecastResponse? {
        val responseHourly: Response<HourlyForecastResponse?> = endpointsHourly.hourlyForecastByCityName(
                "$cityName,$state,$countryCode", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun hourlyForecastByCityId(cityId: String?): HourlyForecastResponse? {
        val responseHourly: Response<HourlyForecastResponse?> = endpointsHourly.hourlyForecastByCityId(
                cityId, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun hourlyForecastByCoOrd(latitude: String?, longitude: String?): HourlyForecastResponse? {
        val responseHourly: Response<HourlyForecastResponse?> = endpointsHourly.hourlyForecastByCoOrd(
                latitude, longitude, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun hourlyForecastByZip(zipCode: String, countryCode: String): HourlyForecastResponse? {
        val responseHourly: Response<HourlyForecastResponse?> = endpointsHourly.hourlyForecastByZip(
                "$zipCode,$countryCode", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }
}