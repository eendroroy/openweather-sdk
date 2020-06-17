package com.github.eendroroy.sdk.openweathermap.util

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import javax.xml.bind.DatatypeConverter

/**
 * @author indrajit
 */
class DigestUtil {
    @Throws(NoSuchAlgorithmException::class)
    fun md5(text: String): String {
        val md = MessageDigest.getInstance("MD5")
        md.update(text.toByteArray())
        val digest = md.digest()
        return DatatypeConverter.printHexBinary(digest).toLowerCase()
    }
}