package com.github.eendroroy.sdk.openweather.api;

import com.github.eendroroy.sdk.openweather.ClientFactory;
import com.github.eendroroy.sdk.openweather.Unit;
import com.github.eendroroy.sdk.openweather.api.test.support.LoggingInterceptor;
import com.github.eendroroy.sdk.openweather.client.WeatherClient;
import com.github.eendroroy.sdk.openweather.interceptor.OWInterceptor;
import com.github.eendroroy.sdk.openweather.response.FindWeatherResponse;
import com.github.eendroroy.sdk.openweather.response.GetWeatherResponse;

import java.io.IOException;

/**
 * @author indrajit
 */

class OWClientTest {
    public static void main(String[] args) {
        OWInterceptor interceptor = new LoggingInterceptor();
        WeatherClient client = new ClientFactory().with(interceptor).weatherClient();

        try {
            GetWeatherResponse response1 = client.weatherByCityName("London");
            System.out.print(response1.toString());
            System.out.print(response1.getWeather().get(0).iconUrl());

            GetWeatherResponse response2 = client.weatherByCityName("London", "London");
            System.out.print(response2.toString());
            System.out.print(response2.getWeather().get(0).iconUrl());

            GetWeatherResponse response3 = client.weatherByCityName("London", "London", "uk");
            System.out.print(response3.toString());
            System.out.print(response3.getWeather().get(0).iconUrl());

            GetWeatherResponse response4 = client.weatherByCityId("2172797");
            System.out.print(response4.toString());
            System.out.print(response4.getWeather().get(0).iconUrl());

            GetWeatherResponse response5 = client.weatherByCoOrd("35", "139");
            System.out.print(response5.toString());
            System.out.print(response5.getWeather().get(0).iconUrl());

            GetWeatherResponse response6 = client.weatherByZip("94040", "us");
            System.out.print(response6.toString());
            System.out.print(response6.getWeather().get(0).iconUrl());

            FindWeatherResponse response7 = client.weatherByCityName("London", Unit.IMPERIAL);
            System.out.print(response7.toString());
            System.out.print(response7.getWeathers().get(0).getWeather().get(0).iconUrl());

            FindWeatherResponse response8 = client.weatherByCityName("London", "London", Unit.IMPERIAL);
            System.out.print(response8.toString());
            System.out.print(response8.getWeathers().get(0).getWeather().get(0).iconUrl());

            FindWeatherResponse response9 = client.weatherByCityName("London", "London", "uk", Unit.IMPERIAL);
            System.out.print(response9.toString());
            System.out.print(response9.getWeathers().get(0).getWeather().get(0).iconUrl());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}