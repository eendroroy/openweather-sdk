package com.github.eendroroy.sdk.openweather.interceptor;

import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;

import java.io.IOException;

/**
 * @author indrajit
 */

public abstract class AbstractOWInterceptor implements OWInterceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request = interceptRequest(request);

        Response response = chain.proceed(request);
        response = interceptResponse(response);

        return response;
    }

    public abstract Request interceptRequest(Request request);

    public abstract Response interceptResponse(Response response);

    @Override
    public String rawResponseBody(Response response) {
        try {
            ResponseBody responseBody = response.body();
            if ( null == responseBody) {
                return "";
            }
            BufferedSource source = responseBody.source();
            source.request(Long.MAX_VALUE);
            Buffer buffer = source.getBuffer().clone();
            return buffer.readUtf8();
        } catch (IOException | IllegalStateException e) {
            return "<->";
        }
    }

    @Override
    public String rawRequestBody(final Request request) {
        try {
            final Request copy = request.newBuilder().build();
            final Buffer buffer = new Buffer();
            RequestBody body = copy.body();
            if (null == body) {
                return "> EMPTY_BODY <";
            }
            body.writeTo(buffer);
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "<->";
        }
    }
}
