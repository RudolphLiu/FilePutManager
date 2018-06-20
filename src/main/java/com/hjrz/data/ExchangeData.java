package com.hjrz.data;

import com.hjrz.constants.CallStatusEnum;
import com.hjrz.constants.YNEnum;
import com.hjrz.util.LoggerUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName ExchangeData
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年3月31日 下午4:53:42
 * @version 1.0.0
 */
public class ExchangeData<T> {
      // 需要返回id情况下使用
      private String id;

      public String getId() {
        return id;
      }

      public void setId(String id) {
        this.id = id;
      }
      
      // 提示信息,前端/调用方直接显示
      private String message = "";
      
      @SuppressWarnings("unchecked")
      private T data = (T) new String[] {};
     
      private YNEnum authStatus = YNEnum.Y;
      
      private CallStatusEnum callStatus = CallStatusEnum.SUCCESS;
      
      public void markSuccess(String message){
        callStatus =CallStatusEnum.SUCCESS;
        this.message=message;
      }
      
      public void markFail() {
        callStatus = CallStatusEnum.FAIL;
        this.message = "系统异常,请稍后再试";
      }
      
      public void markException(Throwable e) {
        callStatus = CallStatusEnum.FAIL;
        this.message = e.getMessage();
        LoggerUtil.logException(ExchangeData.class, e);
      }
      
      public void markException(String message, Throwable e) {
        callStatus = CallStatusEnum.FAIL;
        this.message = message;
        LoggerUtil.logException(ExchangeData.class, e);
      }
      
      public void markFail(String message) {
        callStatus = CallStatusEnum.FAIL;
        if (StringUtils.isNotBlank(message)) {
          this.message = message;
        } else {
          markFail();
        }
      }
      
      public void markUnLogin(){
          this.authStatus = YNEnum.N;
          this.callStatus = CallStatusEnum.FAIL;
          markFail("用户未登录,请重新登录");
      }
      
      public String getMessage() {
        return message;
      }

      public void setMessage(String message) {
        this.message = message;
      }

      public T getData() {
        return data;
      }

      public void setData(T data) {
        this.data = data;
      }

      public CallStatusEnum getCallStatus() {
        return callStatus;
      }

      public void setCallStatus(CallStatusEnum callStatus) {
        this.callStatus = callStatus;
      }
      
}
