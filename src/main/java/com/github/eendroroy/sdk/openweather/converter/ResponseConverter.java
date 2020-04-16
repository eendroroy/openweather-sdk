package com.github.eendroroy.sdk.openweather.converter;

import com.github.eendroroy.sdk.openweather.response.GetWeatherResponse;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;

/**
 * @author indrajit
 */

public class ResponseConverter<T> {
    Retrofit retrofit;
    Response<T> response;

    public ResponseConverter(Retrofit retrofit, Response<T> response){
        this.retrofit = retrofit;
        this.response = response;
    }

    public T convert() throws IOException {
        if(response.isSuccessful()) {
            return response.body();
        } else {
            Converter<ResponseBody, GetWeatherResponse> errorConverter =
                    retrofit.responseBodyConverter(GetWeatherResponse.class, new Annotation[0]);
            assert response.errorBody() != null;
            return (T) errorConverter.convert(response.errorBody());
        }
    }

}
