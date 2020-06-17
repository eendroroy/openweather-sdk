package com.github.eendroroy.sdk.openweathermap.interceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

/**
 * @author indrajit
 */
interface OWInterceptor : Interceptor {
    fun rawRequestBody(request: Request): String
    fun rawResponseBody(response: Response): String
}