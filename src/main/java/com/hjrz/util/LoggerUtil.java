package com.hjrz.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName LoggerUtil
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月27日 上午10:47:01
 * @version 1.0.0
 */
public class LoggerUtil {
  @SuppressWarnings("rawtypes")
  public static void logInfo(Class loggerName,String content){
    Logger logger = LoggerFactory.getLogger(loggerName);
    logger.info(content);
  }
  
  @SuppressWarnings("rawtypes")
  public static void logInfo(Class loggerName,Object object){
    Logger logger = LoggerFactory.getLogger(loggerName);
    logger.info(object.toString());
  }
  
  @SuppressWarnings("rawtypes")
  public static void logException(Class loggerName, String content, Throwable e) {
    Logger logger = LoggerFactory.getLogger(loggerName);
    logger.info(content,e);
  }
  
  @SuppressWarnings("rawtypes")
  public static void logException(Class loggerName, Throwable e) {
    Logger logger = LoggerFactory.getLogger(loggerName);
    logger.info(e.getMessage(),e);
  }
}
