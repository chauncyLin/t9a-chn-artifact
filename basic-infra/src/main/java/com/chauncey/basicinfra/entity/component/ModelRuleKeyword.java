/**
 * @className：ModelRuleKeyword
 * @description: 模型关键词规则
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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModelRuleKeyword implements Serializable {

    private static final long serialVersionUID = 1L;

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
