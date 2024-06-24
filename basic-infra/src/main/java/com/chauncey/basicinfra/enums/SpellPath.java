/**
 * @className：UnitType
 * @description: 单位类型枚举
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:40
 * @version 1.0
 */
package com.chauncey.basicinfra.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum SpellPath {

    DRUIDISM("Druidism","德鲁伊"),
    EVOCATION("Evocation","招魂术");

    @EnumValue
    private String code;

    private String value;

    SpellPath(String code, String value){
        this.code = code;
        this.value = value;
    }
}
