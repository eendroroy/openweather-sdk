package com.github.eendroroy.sdk.openweather;

import com.github.eendroroy.sdk.openweather.client.WeatherClient;
import com.github.eendroroy.sdk.openweather.config.DefaultWeatherConfiguration;
import com.github.eendroroy.sdk.openweather.config.WeatherConfiguration;
import com.github.eendroroy.sdk.openweather.interceptor.DefaultOWInterceptor;
import com.github.eendroroy.sdk.openweather.interceptor.OWInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * @author indrajit
 */

public class ClientFactory {
    private final OWInterceptor interceptor;
    private final WeatherConfiguration weatherConfiguration;

    public ClientFactory() {
        this(new DefaultWeatherConfiguration(), new DefaultOWInterceptor());
    }

    public ClientFactory(WeatherConfiguration weatherConfiguration) {
        this(weatherConfiguration, new DefaultOWInterceptor());
    }

    public ClientFactory(WeatherConfiguration weatherConfiguration, OWInterceptor interceptor) {
        this.weatherConfiguration = weatherConfiguration;
        this.interceptor = interceptor;
    }

    public WeatherClient weatherClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(weatherConfiguration.getBaseUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return new WeatherClient(retrofit, weatherConfiguration);
    }
}
