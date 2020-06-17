package com.github.eendroroy.sdk.openweathermap

import com.github.eendroroy.sdk.openweathermap.client.WeatherClient
import com.github.eendroroy.sdk.openweathermap.config.DefaultWeatherConfiguration
import com.github.eendroroy.sdk.openweathermap.config.WeatherConfiguration
import com.github.eendroroy.sdk.openweathermap.interceptor.DefaultOWInterceptor
import com.github.eendroroy.sdk.openweathermap.interceptor.OWInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

/**
 * @author indrajit
 */
class ClientFactory {
    private var interceptor: OWInterceptor = DefaultOWInterceptor()
    private var weatherConfiguration: WeatherConfiguration = DefaultWeatherConfiguration()
    fun with(weatherConfiguration: WeatherConfiguration): ClientFactory {
        this.weatherConfiguration = weatherConfiguration
        return this
    }

    fun with(interceptor: OWInterceptor): ClientFactory {
        this.interceptor = interceptor
        return this
    }

    fun weatherClient(): WeatherClient {
        val okHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()
        val retrofit = Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(weatherConfiguration.baseUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
        return WeatherClient(retrofit, weatherConfiguration)
    }
}