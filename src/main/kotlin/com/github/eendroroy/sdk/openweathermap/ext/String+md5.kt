package com.github.eendroroy.sdk.openweathermap.ext

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import javax.xml.bind.DatatypeConverter

/**
 * @author indrajit
 */

@Throws(NoSuchAlgorithmException::class)
fun String.md5(text: String): String {
    val md = MessageDigest.getInstance("MD5")
    md.update(text.toByteArray())
    val digest = md.digest()
    return DatatypeConverter.printHexBinary(digest).toLowerCase()
}