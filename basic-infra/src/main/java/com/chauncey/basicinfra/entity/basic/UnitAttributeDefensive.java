/**
 * @className：BasicUnitRole
 * @description: TODO
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity.basic;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UnitAttributeDefensive {

    private int hp;

    private int def;

    private int res;

    private int arm;

    private List<ModelRuleKeyword> defModelRule;
}
