/*********************************************************
 *    Package:     com.hjrz.system.constants				
 *    Filename:    YNEnum.java					
 *    Description: TODO(用一句话描述该文件做什么)
 *    @author:     RudolphLiu
 *    @version:    1.0.0
 *    Create at:   2018年5月2日 下午2:08:42
 *********************************************************/
package com.hjrz.constants;

import java.util.LinkedHashMap;
import java.util.Map;

import com.hjrz.exception.EnumNotFoundException;

/**
 * @ClassName YNEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2018年5月2日 下午2:08:42
 * @version 1.0.0
 */
public enum YNEnum {
    
    Y(1, "是"), N(2, "否"), ALL(3, "都可以"),RESERT(4, "重置"),REVIEW(5,"审核"),UNMATCH(6,"未匹配");

    private int code;

    private String desc;

    private YNEnum(int code, String desc) {
      this.code = code;
      this.desc = desc;
    }

    private static final Map<Integer, YNEnum> BY_VALUE_MAP = new LinkedHashMap<>();

    static {
      for (YNEnum enumValue : YNEnum.values()) {
        BY_VALUE_MAP.put(enumValue.getCode(), enumValue);
      }
    }

    public static YNEnum convertCode2Enum(int code) throws EnumNotFoundException {
      if (!BY_VALUE_MAP.containsKey(code)) {
        throw new EnumNotFoundException("枚举对应的code" + code + "不存在");
      }
      return BY_VALUE_MAP.get(code);
    }

    public static YNEnum convertStr2Enum(String str) throws EnumNotFoundException {
      try {
        return YNEnum.valueOf(str);
      } catch (Exception e) {
        throw new EnumNotFoundException("枚举对应常量" + str + "不存在");
      }
    }
    
    
    public String getName(){
      return name();
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
