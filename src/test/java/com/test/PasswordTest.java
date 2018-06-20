package com.test;

import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class PasswordTest {
    public static void main(String[] args) {
        String hashALgorithmName = "MD5";
        String credentials = "a123456";
        Object salt = null;
        int hashiterations = 1;

        SimpleHash result = new SimpleHash(hashALgorithmName,credentials,salt,hashiterations);

        System.out.println(result.toString());

    }
}
