/**
 * @className：BasicUnitRole
 * @description: 基本军表实体类
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BasicArmyList implements Serializable {

    private static final long serialVersionUID = 1L;

    private String armyListName;

    private int armyListPointSize;

    private List<Map<String,List<Object>>> listSection;
}
