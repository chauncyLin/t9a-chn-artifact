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
public class UnitAttributeGlobal {

    private int adv;

    private int mar;

    private int dis;

    private List<ModelRuleKeyword> globalModelRule;
}
