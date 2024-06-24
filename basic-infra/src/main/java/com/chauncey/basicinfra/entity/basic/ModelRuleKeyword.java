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

@Getter
@Setter
public class ModelRuleKeyword {

    private String ruleName;

    private String ruleContent;

    private String paramRule;

    public String getRuleName() {
        if(paramRule == null || paramRule.isEmpty()){
            ruleName = ruleName + "(" + paramRule + ")";
        }
        return ruleName;
    }
}
