/**
 * @className：UnitAttributeOffensive
 * @description: 单位基础进攻属性
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity.component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnitAttributeOffensive implements Serializable {

    private static final long serialVersionUID = 1L;

    private int att;

    private int off;

    private int str;

    private int ap;

    private int agi;

    private List<ModelRuleKeyword> offModelRule;
}
