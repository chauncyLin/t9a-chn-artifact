/**
 * @className：BasicUnitRole
 * @description: 基本单位实体类
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity;

import com.chauncey.basicinfra.enums.SpecialItemType;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BasicSpecialItemRule {

    private String itemName;

    private Enum<SpecialItemType> specialItemTypeEnum;

    private int itemCost;

    private String unitRestrict;

    private int numberRestrictTop;

    private String itemTarget;

    private String description;
}
