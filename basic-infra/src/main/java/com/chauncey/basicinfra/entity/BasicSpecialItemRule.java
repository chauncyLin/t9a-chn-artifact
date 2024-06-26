/**
 * @className：BasicSpecialItemRule
 * @description: 基本魔法奇物实体类
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity;

import com.chauncey.basicinfra.enums.SpecialItemType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BasicSpecialItemRule implements Serializable {

    private static final long serialVersionUID = 1L;

    private String itemId;

    private String itemName;

    private Enum<SpecialItemType> specialItemTypeEnum;

    private int itemCost;

    private String unitRestrict;

    private int numberRestrictTop;

    private String itemTarget;

    private String description;
}
