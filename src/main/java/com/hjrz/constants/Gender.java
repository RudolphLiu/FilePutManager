package com.hjrz.constants;

import com.hjrz.exception.EnumNotFoundException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum Gender {

    MALE(1,"男"),
    FEMALE(2,"女");

    private int code;

    private String desc;

    private static final Map<Integer, Gender> BY_VALUE_MAP = new LinkedHashMap<>();

    static {
        for (Gender enumValue : Gender.values()) {
            BY_VALUE_MAP.put(enumValue.getCode(), enumValue);
        }
    }

    public static Gender convertCode2Enum(int code) throws EnumNotFoundException {
        if (!BY_VALUE_MAP.containsKey(code)) {
            throw new EnumNotFoundException("枚举对应的code" + code + "不存在");
        }
        return BY_VALUE_MAP.get(code);
    }

    public static Gender convertStr2Enum(String str) throws EnumNotFoundException {
        try {
            return Gender.valueOf(str);
        } catch (Exception e) {
            throw new EnumNotFoundException("枚举对应常量" + str + "不存在");
        }
    }

    /**
     * 创建一个新的实例 Gender.
     * @param code
     * @param desc
     */
    private Gender(int code, String desc) {
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
