/**
 * @className：BasicUnitRole
 * @description: 基本单位实体类
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity;

import com.chauncey.basicinfra.entity.basic.UnitAttribute;
import com.chauncey.basicinfra.enums.ModelBaseSize;
import com.chauncey.basicinfra.enums.UnitType;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class BasicUnitRule {

    private String unitName;

    private int pointCost;

    private int unitGroupScaleTop;

    private int unitHeight;

    private Enum<UnitType> unitType;

    private Enum<ModelBaseSize> baseSize;

    private String description;

    private UnitAttribute unitAttribute;

    private Map<String,Object> rulesOptions;

    private Map<String,Object> equipOptions;

    private Map<String,Object> mountOptions;
}
