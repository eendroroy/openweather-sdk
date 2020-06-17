package com.github.eendroroy.sdk.openweathermap.converter

import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException

/**
 * @author indrajit
 */
class ResponseConverter<T>(var retrofit: Retrofit, var apiResponse: Response<T>) {

    @Throws(IOException::class)
    inline fun <reified T> convert(): T? {
        return if (apiResponse.isSuccessful) {
            apiResponse.body() as T?
        } else {
            val errorConverter = retrofit.responseBodyConverter<T>(T::class.java, arrayOfNulls(0))
            errorConverter.convert(apiResponse.errorBody()!!)
        }
    }
}