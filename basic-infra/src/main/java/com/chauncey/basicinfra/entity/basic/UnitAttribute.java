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
public class UnitAttribute {

    private UnitAttributeGlobal unitAttributeGlobal;

    private UnitAttributeDefensive unitAttributeDefensive;

    private UnitAttributeOffensive unitAttributeOffensive;

}
