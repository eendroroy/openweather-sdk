package com.github.eendroroy.sdk.openweathermap.client

import com.github.eendroroy.sdk.openweathermap.config.OWConfiguration
import com.github.eendroroy.sdk.openweathermap.converter.ResponseConverter
import com.github.eendroroy.sdk.openweathermap.endpoint.DailyForecastEndpoints
import com.github.eendroroy.sdk.openweathermap.response.DailyForecastResponse
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException

/**
 * @author indrajit
 */
class DailyForecastClient(
        private val retrofit: Retrofit,
        private val configuration: OWConfiguration
) {
    private val endpointsDaily: DailyForecastEndpoints = retrofit.create(DailyForecastEndpoints::class.java)

    @Throws(IOException::class)
    fun dailyForecastByCityName(cityName: String): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCityName(
                cityName, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByCityName(cityName: String, state: String): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCityName(
                "$cityName,$state", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByCityName(cityName: String, state: String, countryCode: String): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCityName(
                "$cityName,$state,$countryCode", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByCityId(cityId: String): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCityId(
                cityId, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByCoOrd(latitude: Double, longitude: Double): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCoOrd(
                latitude, longitude, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByZip(zipCode: String, countryCode: String): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByZip(
                "$zipCode,$countryCode", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }
}