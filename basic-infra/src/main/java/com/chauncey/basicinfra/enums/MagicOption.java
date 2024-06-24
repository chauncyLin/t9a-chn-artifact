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
public enum MagicOption {

    MAGIC_ADAPT("MagicAdapt","魔法专家",95);

    @EnumValue
    private String name;

    private String value;

    private int pointCost;

    MagicOption(String name, String value,int pointCost){
        this.name = name;
        this.value = value;
        this.pointCost = pointCost;
    }
}
