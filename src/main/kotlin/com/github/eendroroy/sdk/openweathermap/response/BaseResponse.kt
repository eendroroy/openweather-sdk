package com.github.eendroroy.sdk.openweathermap.response

/**
 * @author indrajit
 */
interface BaseResponse {
    var httpCode: Int?
    var httpMessage: String?
}