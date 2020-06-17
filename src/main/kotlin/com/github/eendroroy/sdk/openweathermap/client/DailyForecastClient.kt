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
        private val OWConfiguration: OWConfiguration
) {
    private val endpointsDaily: DailyForecastEndpoints = retrofit.create(DailyForecastEndpoints::class.java)

    @Throws(IOException::class)
    fun dailyForecastByCityName(cityName: String?): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCityName(
                cityName, OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByCityName(cityName: String, state: String): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCityName(
                "$cityName,$state", OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByCityName(cityName: String, state: String, countryCode: String): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCityName(
                "$cityName,$state,$countryCode", OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByCityId(cityId: String?): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCityId(
                cityId, OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByCoOrd(latitude: String?, longitude: String?): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByCoOrd(
                latitude, longitude, OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun dailyForecastByZip(zipCode: String, countryCode: String): DailyForecastResponse? {
        val responseHourly: Response<DailyForecastResponse?> = endpointsDaily.dailyForecastByZip(
                "$zipCode,$countryCode", OWConfiguration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }
}