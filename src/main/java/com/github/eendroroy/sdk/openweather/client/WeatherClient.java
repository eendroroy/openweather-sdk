package com.github.eendroroy.sdk.openweather.client;

import com.github.eendroroy.sdk.openweather.config.WeatherConfiguration;
import com.github.eendroroy.sdk.openweather.converter.ResponseConverter;
import com.github.eendroroy.sdk.openweather.endpoint.WeatherEndpoints;
import com.github.eendroroy.sdk.openweather.response.GetWeatherResponse;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

/**
 * @author indrajit
 */

public class WeatherClient {
    private final Retrofit retrofit;
    private final WeatherEndpoints endpoints;
    private final WeatherConfiguration weatherConfiguration;

    public WeatherClient(Retrofit retrofit, WeatherConfiguration weatherConfiguration) {
        this.retrofit = retrofit;
        this.endpoints = retrofit.create(WeatherEndpoints.class);
        this.weatherConfiguration = weatherConfiguration;
    }

    public GetWeatherResponse weatherByCityName(String cityName) throws IOException {
        Response<GetWeatherResponse> response =
                endpoints.weatherByCityName(cityName, weatherConfiguration.getAppId()).execute();
        return new ResponseConverter<>(retrofit, response).convert();
    }

    public GetWeatherResponse weatherByCityName(String cityName, String state) throws IOException {
        Response<GetWeatherResponse> response =
                endpoints.weatherByCityName(
                        cityName + "," + state,
                        weatherConfiguration.getAppId()
                ).execute();
        return new ResponseConverter<>(retrofit, response).convert();
    }

    public GetWeatherResponse weatherByCityName(String cityName, String state, String countryCode) throws IOException {
        Response<GetWeatherResponse> response =
                endpoints.weatherByCityName(
                        cityName + "," + state + "," + countryCode,
                        weatherConfiguration.getAppId()
                ).execute();
        return new ResponseConverter<>(retrofit, response).convert();
    }

    public GetWeatherResponse weatherByCityId(String cityId) throws IOException {
        Response<GetWeatherResponse> response =
                endpoints.weatherByCityId(cityId, weatherConfiguration.getAppId()).execute();
        return new ResponseConverter<>(retrofit, response).convert();
    }

    public GetWeatherResponse weatherByCoOrd(String latitude, String longitude) throws IOException {
        Response<GetWeatherResponse> response =
                endpoints.weatherByCoOrd(latitude, longitude, weatherConfiguration.getAppId()).execute();
        return new ResponseConverter<>(retrofit, response).convert();
    }

    public GetWeatherResponse weatherByZip(String zipCode, String countryCode) throws IOException {
        Response<GetWeatherResponse> response =
                endpoints.weatherByZip(
                        zipCode + "," + countryCode,
                        weatherConfiguration.getAppId()
                ).execute();
        return new ResponseConverter<>(retrofit, response).convert();
    }
}
