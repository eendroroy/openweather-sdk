package com.github.eendroroy.sdk.openweathermap.api.test.support

import com.github.eendroroy.sdk.openweathermap.interceptor.AbstractOWInterceptor
import okhttp3.Request
import okhttp3.Response

/**
 * @author indrajit
 */
class LoggingInterceptor : AbstractOWInterceptor() {
    override fun interceptRequest(request: Request): Request {
        println()
        println("Request  --> " + request.url().toString())
        println("Request  --> " + rawRequestBody(request))
        return request
    }

    override fun interceptResponse(response: Response): Response {
        println()
        println("Response --> " + response.code())
        println("Response --> " + response.message())
        println("Response --> " + rawResponseBody(response))
        return response
    }
}