/**
 * @className：BasicUnitRole
 * @description: 基本单位实体类
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity;

import com.chauncey.basicinfra.enums.ModelBaseSize;
import com.chauncey.basicinfra.enums.SpellPath;
import com.chauncey.basicinfra.enums.UnitType;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BasicSpellRule {

    private String spellName;

    private Enum<SpellPath> spellPath;

    private int castingValue;

    private int range;

    private Enum<UnitType> spellType;

    private Enum<ModelBaseSize> spellDuration;

    private String effect;
}
