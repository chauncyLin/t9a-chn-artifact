/**
 * @className：UnitAttribute
 * @description: 单位属性
 * @author: CN-ChengyuanLin
 * @date: 2024/6/24 13:34
 * @version 1.0
 */
package com.chauncey.basicinfra.entity.component;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UnitAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    private UnitAttributeGlobal unitAttributeGlobal;

    private UnitAttributeDefensive unitAttributeDefensive;

    private UnitAttributeOffensive unitAttributeOffensive;

}
