/**
 * @className：BasicSpellRule
 * @description: 基本法术实体类
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity;

import com.chauncey.basicinfra.enums.SpellDurationType;
import com.chauncey.basicinfra.enums.SpellPath;
import com.chauncey.basicinfra.enums.SpellType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasicSpellRule implements Serializable {

    private static final long serialVersionUID = 1L;

    private String spellId;

    private String spellName;

    private Enum<SpellPath> spellPath;

    private int castingValue;

    private int range;

    private Enum<SpellType> spellType;

    private Enum<SpellDurationType> spellDuration;

    private String effect;
}
