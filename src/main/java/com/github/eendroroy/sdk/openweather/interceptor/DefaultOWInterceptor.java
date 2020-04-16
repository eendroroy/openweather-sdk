package com.github.eendroroy.sdk.openweather.interceptor;

import okhttp3.Request;
import okhttp3.Response;

/**
 * @author indrajit
 */

public class DefaultOWInterceptor extends AbstractOWInterceptor {
    @Override
    public Request interceptRequest(Request request) {
        return request;
    }

    @Override
    public Response interceptResponse(Response response) {
        return response;
    }
}
