package com.github.eendroroy.sdk.openweathermap.interceptor

import okhttp3.Request
import okhttp3.Response

/**
 * @author indrajit
 */
class DefaultOWInterceptor : AbstractOWInterceptor() {
    override fun interceptRequest(request: Request): Request {
        return request
    }

    override fun interceptResponse(response: Response): Response {
        return response
    }
}