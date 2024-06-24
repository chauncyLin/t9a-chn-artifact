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
public enum ModelBaseSize {

    SQUARE_20_TIMES_20(1,"20*20 mm"),
    SQUARE_25_TIMES_25(2,"25*25 mm");

    @EnumValue
    private int code;

    private String value;

    ModelBaseSize(int code,String value){
        this.code = code;
        this.value = value;
    }
}
