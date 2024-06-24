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
public enum SpecialItemType {

    WEAPON_ENCHANTMENTS(1,"武器附魔"),
    ARMOUR_ENCHANTMENTS(2,"护甲附魔"),
    BANNER_ENCHANTMENTS(3,"旗帜附魔"),
    ARTIFACT(4,"魔法奇物");

    @EnumValue
    private int code;

    private String value;

    SpecialItemType(int code,String value){
        this.code = code;
        this.value = value;
    }
}
