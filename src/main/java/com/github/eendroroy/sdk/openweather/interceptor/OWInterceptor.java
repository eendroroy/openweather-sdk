package com.github.eendroroy.sdk.openweather.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author indrajit
 */

public interface OWInterceptor extends Interceptor {
    String rawRequestBody(Request request);
    String rawResponseBody(Response response);
}
