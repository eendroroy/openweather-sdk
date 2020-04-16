package com.github.eendroroy.sdk.openweather.api.test.support;

import com.github.eendroroy.sdk.openweather.interceptor.AbstractOWInterceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author indrajit
 */

public class LoggingInterceptor extends AbstractOWInterceptor {

    @Override
    public Request interceptRequest(Request request) {
        System.out.println();
        System.out.println("Request  --> " + request.url().toString());
        System.out.println("Request  --> " + rawRequestBody(request));
        return request;
    }

    @Override
    public Response interceptResponse(Response response) {
        System.out.println();
        System.out.println("Response --> " + response.code());
        System.out.println("Response --> " + response.message());
        System.out.println("Response --> " + rawResponseBody(response));
        return response;
    }
}
