package com.github.eendroroy.sdk.openweather.util;

import lombok.SneakyThrows;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author indrajit
 */

public class DigestUtil {
    @SneakyThrows(NoSuchAlgorithmException.class)
    public String md5(String text){
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toLowerCase();
    }
}
