package com.github.eendroroy.sdk.openweathermap.response

/**
 * @author indrajit
 */
interface BaseResponse {
    var httpCode: String?
    var httpMessage: String?
}