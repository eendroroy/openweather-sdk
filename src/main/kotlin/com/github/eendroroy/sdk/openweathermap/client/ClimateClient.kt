package com.github.eendroroy.sdk.openweathermap.client

import com.github.eendroroy.sdk.openweathermap.config.OWConfiguration
import com.github.eendroroy.sdk.openweathermap.converter.ResponseConverter
import com.github.eendroroy.sdk.openweathermap.endpoint.ClimateEndpoints
import com.github.eendroroy.sdk.openweathermap.response.ClimateResponse
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException

/**
 * @author indrajit
 */
class ClimateClient(
        private val retrofit: Retrofit,
        private val configuration: OWConfiguration
) {
    private val endpointsDaily: ClimateEndpoints = retrofit.create(ClimateEndpoints::class.java)

    @Throws(IOException::class)
    fun climateByCityName(cityName: String?): ClimateResponse? {
        val responseHourly: Response<ClimateResponse?> = endpointsDaily.climateByCityName(
                cityName, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun climateByCityName(cityName: String, state: String): ClimateResponse? {
        val responseHourly: Response<ClimateResponse?> = endpointsDaily.climateByCityName(
                "$cityName,$state", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun climateByCityName(cityName: String, state: String, countryCode: String): ClimateResponse? {
        val responseHourly: Response<ClimateResponse?> = endpointsDaily.climateByCityName(
                "$cityName,$state,$countryCode", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun climateByCityId(cityId: String?): ClimateResponse? {
        val responseHourly: Response<ClimateResponse?> = endpointsDaily.climateByCityId(
                cityId, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun climateByCoOrd(latitude: String?, longitude: String?): ClimateResponse? {
        val responseHourly: Response<ClimateResponse?> = endpointsDaily.climateByCoOrd(
                latitude, longitude, configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }

    @Throws(IOException::class)
    fun climateByZip(zipCode: String, countryCode: String): ClimateResponse? {
        val responseHourly: Response<ClimateResponse?> = endpointsDaily.climateByZip(
                "$zipCode,$countryCode", configuration.appId()
        ).execute()
        return ResponseConverter(retrofit, responseHourly).convert()
    }
}