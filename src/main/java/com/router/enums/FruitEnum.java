package com.router.enums;

public enum FruitEnum {
    APPLE("APPLE", "苹果"),
    ORANGE("ORANGE", "橘子"),
    ALL("ALL", "都要"),
    ;

    private String code;
    private String desc;

    FruitEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
