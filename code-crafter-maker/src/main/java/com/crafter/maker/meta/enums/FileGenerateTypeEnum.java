package com.crafter.maker.meta.enums;

/**
 * 文件生成类型枚举类
 */
public enum FileGenerateTypeEnum {

    DYNAMIC("动态","dynamic"),
    STATIC("静态","static");

    private final String text;

    private final String value;

    FileGenerateTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public String getText(){
        return text;
    }
}
