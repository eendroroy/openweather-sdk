package com.github.eendroroy.sdk.openweathermap

import com.github.eendroroy.sdk.openweathermap.client.UnsafeOkHttpClientBuilder
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
    val weatherClient: WeatherClient get() { return WeatherClient(retrofit, configuration) }

    private var interceptor: OWInterceptor = DefaultOWInterceptor()
    private var configuration: WeatherConfiguration = DefaultWeatherConfiguration()

    fun with(weatherConfiguration: WeatherConfiguration): ClientFactory {
        this.configuration = weatherConfiguration
        return this
    }

    fun with(interceptor: OWInterceptor): ClientFactory {
        this.interceptor = interceptor
        return this
    }

    private val retrofit: Retrofit
        get() {
            val okHttpClientBuilder: OkHttpClient.Builder = if (configuration.acceptUnsafeSSL()) {
                UnsafeOkHttpClientBuilder.unsafeOkHttpClientBuilder
            } else {
                OkHttpClient.Builder()
            }

            val okHttpClient = okHttpClientBuilder.addInterceptor(interceptor).build()

            return Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(configuration.baseUrl())
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build()
        }
}