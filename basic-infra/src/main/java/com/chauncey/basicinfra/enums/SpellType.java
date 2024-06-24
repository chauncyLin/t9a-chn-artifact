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
public enum SpellType {

    SPELL_AUGMENT(1,"步兵");

    @EnumValue
    private int code;

    private String value;

    SpellType(int code,String value){
        this.code = code;
        this.value = value;
    }
}
