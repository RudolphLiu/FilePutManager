package com.hjrz.constants;

/**
 * @ClassName CallStatusEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月26日 下午5:43:24
 * @version 1.0.0
 */
public enum CallStatusEnum {
    SUCCESS(1, "成功"), FAIL(2, "失败"), IGNORE(3, "请求被忽略,系统不做任何处理");
  
      private int code;
      
      private String desc;
    
      private CallStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
      }
    
      public int getCode() {
        return code;
      }
    
      public void setCode(int code) {
        this.code = code;
      }
    
      public String getDesc() {
        return desc;
      }
    
      public void setDesc(String desc) {
        this.desc = desc;
      }
}
