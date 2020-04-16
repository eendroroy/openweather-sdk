package com.github.eendroroy.sdk.openweather.api;

import com.github.eendroroy.sdk.openweather.ClientFactory;
import com.github.eendroroy.sdk.openweather.api.test.support.LoggingInterceptor;
import com.github.eendroroy.sdk.openweather.client.WeatherClient;
import com.github.eendroroy.sdk.openweather.config.DefaultWeatherConfiguration;
import com.github.eendroroy.sdk.openweather.interceptor.OWInterceptor;
import com.github.eendroroy.sdk.openweather.response.GetWeatherResponse;

import java.io.IOException;

/**
 * @author indrajit
 */

class OWClientTest {
    public static void main(String[] args) {
        OWInterceptor interceptor = new LoggingInterceptor();
        WeatherClient client =
                new ClientFactory(new DefaultWeatherConfiguration(), new LoggingInterceptor()).weatherClient();

        try {
            GetWeatherResponse response1 = client.weatherByCityName("London");
            System.out.print(response1.toString());

            GetWeatherResponse response2 = client.weatherByCityName("London", "London");
            System.out.print(response2.toString());

            GetWeatherResponse response3 = client.weatherByCityName("London", "London", "uk");
            System.out.print(response3.toString());

            GetWeatherResponse response4 = client.weatherByCityId("2172797");
            System.out.print(response4.toString());

            GetWeatherResponse response5 = client.weatherByCoOrd("35", "139");
            System.out.print(response5.toString());

            GetWeatherResponse response6 = client.weatherByZip("94040", "us");
            System.out.print(response6.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}