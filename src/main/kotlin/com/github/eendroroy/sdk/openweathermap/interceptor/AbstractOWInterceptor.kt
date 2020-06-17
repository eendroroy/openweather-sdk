package com.github.eendroroy.sdk.openweathermap.interceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import okio.Buffer
import java.io.IOException

/**
 * @author indrajit
 */
abstract class AbstractOWInterceptor : OWInterceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = interceptRequest(request)
        var response = chain.proceed(request)
        response = interceptResponse(response)
        return response
    }

    abstract fun interceptRequest(request: Request): Request
    abstract fun interceptResponse(response: Response): Response
    override fun rawResponseBody(response: Response): String {
        val responseBody = response.body() ?: return ""
        val source = responseBody.source()
        source.request(Long.MAX_VALUE)
        val buffer = source.buffer.clone()
        return buffer.readUtf8()
    }

    override fun rawRequestBody(request: Request): String {
        val copy = request.newBuilder().build()
        val buffer = Buffer()
        val body = copy.body() ?: return ""
        body.writeTo(buffer)
        return buffer.readUtf8()
    }
}