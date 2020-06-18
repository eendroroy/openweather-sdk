package com.github.eendroroy.sdk.openweathermap

import com.github.eendroroy.sdk.openweathermap.client.*
import com.github.eendroroy.sdk.openweathermap.config.DefaultOWConfiguration
import com.github.eendroroy.sdk.openweathermap.config.OWConfiguration
import com.github.eendroroy.sdk.openweathermap.interceptor.DefaultOWInterceptor
import com.github.eendroroy.sdk.openweathermap.interceptor.OWInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

/**
 * @author indrajit
 */
class ClientFactory {
    val weatherClient: WeatherClient
        get() {
            return WeatherClient(retrofit, configuration)
        }

    val hourlyForecastClient: HourlyForecastClient
        get() {
            return HourlyForecastClient(retrofit, configuration)
        }

    val dailyForecastClient: DailyForecastClient
        get() {
            return DailyForecastClient(retrofit, configuration)
        }

    val climateClient: ClimateClient
        get() {
            return ClimateClient(retrofit, configuration)
        }

    private var interceptor: OWInterceptor = DefaultOWInterceptor()
    private var configuration: OWConfiguration = DefaultOWConfiguration()

    fun with(OWConfiguration: OWConfiguration): ClientFactory {
        this.configuration = OWConfiguration
        return this
    }

    fun with(interceptor: OWInterceptor): ClientFactory {
        this.interceptor = interceptor
        return this
    }

    private val retrofit: Retrofit
        get() {
            val okHttpClientBuilder: OkHttpClient.Builder = when {
                configuration.acceptUnsafeSSL() -> {
                    UnsafeOkHttpClientBuilder.unsafeOkHttpClientBuilder
                }
                else -> {
                    OkHttpClient.Builder()
                }
            }

            val okHttpClient = okHttpClientBuilder.addInterceptor(interceptor).build()

            return Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(configuration.baseUrl())
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build()
        }
}