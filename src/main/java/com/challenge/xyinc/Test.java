package com.challenge.xyinc;

import com.challenge.xyinc.entity.field.FieldValue;
import com.challenge.xyinc.entity.field.FieldType;
import com.challenge.xyinc.entity.field.FieldValueFactory;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {

        FieldValueFactory fieldValueFactory = new FieldValueFactory();
        FieldValue fieldValue = fieldValueFactory.createFieldValue(FieldType.BIGDECIMAL);

        fieldValue.setValue(BigDecimal.valueOf(10L));

        System.out.println(fieldValue.getValue());

    }
}
