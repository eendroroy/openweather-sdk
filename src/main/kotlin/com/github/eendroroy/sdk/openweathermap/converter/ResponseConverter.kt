package com.github.eendroroy.sdk.openweathermap.converter

import com.github.eendroroy.sdk.openweathermap.response.BaseResponse
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException

/**
 * @author indrajit
 */
class ResponseConverter<T>(var retrofit: Retrofit, var response: Response<T>) {
    @Throws(IOException::class)
    fun convert(): T? {
        return if (response.isSuccessful) {
            response.body()
        } else {
            val errorConverter = retrofit.responseBodyConverter<BaseResponse>(BaseResponse::class.java, arrayOfNulls(0))
            errorConverter.convert(response.errorBody()!!) as T?
        }
    }

}