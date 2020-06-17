package com.github.eendroroy.sdk.openweathermap.config

/**
 * @author indrajit
 */
interface OWConfiguration {
    fun baseUrl(): String
    fun appId(): String
    fun acceptUnsafeSSL(): Boolean
}