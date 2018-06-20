/*********************************************************
 *    Package:     com.hjrz.exception				
 *    Filename:    EnumNotFoundException.java					
 *    Description: TODO(用一句话描述该文件做什么)
 *    @author:     RudolphLiu
 *    @version:    1.0.0
 *    Create at:   2018年4月26日 下午6:49:52
 *********************************************************/
package com.hjrz.exception;


/**
 * @ClassName EnumNotFoundException
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2018年4月26日 下午6:49:52
 * @version 1.0.0
 */
public class EnumNotFoundException extends Exception{

    /**  
    * @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
    */  
    private static final long serialVersionUID = 1L;

    /**  
    * 创建一个新的实例 EnumNotFoundException.    
    */  
    public EnumNotFoundException() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**  
    * 创建一个新的实例 EnumNotFoundException.  
    * @param message
    * @param cause
    * @param enableSuppression
    * @param writableStackTrace  
    */  
    public EnumNotFoundException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    /**  
    * 创建一个新的实例 EnumNotFoundException.  
    * @param message
    * @param cause  
    */  
    public EnumNotFoundException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    /**  
    * 创建一个新的实例 EnumNotFoundException.  
    * @param message  
    */  
    public EnumNotFoundException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**  
    * 创建一个新的实例 EnumNotFoundException.  
    * @param cause  
    */  
    public EnumNotFoundException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }
    
    
}
