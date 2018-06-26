package com.hjrz.constants;

import com.hjrz.exception.EnumNotFoundException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum UserStateEnum {
    EFFECTIVE(1,"有效"),
    PROHIBITED(2,"禁止");

    private int code;

    private String desc;

    private static final Map<Integer, UserStateEnum> BY_VALUE_MAP = new LinkedHashMap<>();

    static {
        for (UserStateEnum enumValue : UserStateEnum.values()) {
            BY_VALUE_MAP.put(enumValue.getCode(), enumValue);
        }
    }

    public static UserStateEnum convertCode2Enum(int code) throws EnumNotFoundException {
        if (!BY_VALUE_MAP.containsKey(code)) {
            throw new EnumNotFoundException("枚举对应的code" + code + "不存在");
        }
        return BY_VALUE_MAP.get(code);
    }

    public static UserStateEnum convertStr2Enum(String str) throws EnumNotFoundException {
        try {
            return UserStateEnum.valueOf(str);
        } catch (Exception e) {
            throw new EnumNotFoundException("枚举对应常量" + str + "不存在");
        }
    }

    /**
     * 创建一个新的实例 Gender.
     * @param code
     * @param desc
     */
    private UserStateEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }


    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }


    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
