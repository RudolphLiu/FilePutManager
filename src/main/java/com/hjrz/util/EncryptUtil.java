package com.hjrz.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName EncryptUtil
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月27日 下午3:16:54
 * @version 1.0.0
 */
public class EncryptUtil {
    
      //MD5加密
      public static String getMD5String(String toEncrypt){
            if(StringUtils.isNotBlank(toEncrypt)){
             return DigestUtils.md5Hex(toEncrypt);
          }else{
          return "";
          }
        }
      
      //64加密
      public static String encodeBase64String(String source){
         try{
           return Base64.encodeBase64String(source.getBytes("utf-8"));
         }catch(UnsupportedEncodingException e){
           return "";
         }
      }
      
    //64解密
      public static String decodeBase64String(String source){
         try {
           String stringWithdecode = new String(Base64.decodeBase64(source.getBytes("utf-8")));   
           return stringWithdecode;
         } catch (UnsupportedEncodingException e) {
           // TODO Auto-generated catch block
           return "";
         }
      }
      
      //默认16位
      public static String getRandomSalt(int count){
        if(count<=0){
          count=16;
        }
        return RandomStringUtils.randomAlphanumeric(count);
      }

      
      public static String enctyPwdsaWithSalt(String password,String salt){
          if (StringUtils.isNotBlank(password) && StringUtils.isNotBlank(salt)) {
            return DigestUtils.sha256Hex(password + salt);
          }
          else{
            throw new RuntimeException("密码和salt");
          }
       }
}
