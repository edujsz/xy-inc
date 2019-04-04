package com.challenge.xyinc.entity.field;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class FieldValueFactory extends BaseFieldValueFactory{
    @Override
    public FieldValue createFieldValue(FieldType fieldType) throws ParseException {
        FieldValue fieldValue;
        switch (fieldType) {
            case BIGDECIMAL:
                fieldValue = new FieldValue<BigDecimal>();
                fieldValue.setValue(BigDecimal.valueOf(10L));
                break;
            case DATE:
                DateFormat dateFormat = DateFormat.getDateInstance();
                fieldValue = new FieldValue<Date>();
                fieldValue.setValue(dateFormat.parse(""));
                break;
            case STRING:
                fieldValue = new FieldValue<String>();
                break;
            case BOOLEAN:
                fieldValue = new FieldValue<Boolean>();
                break;
            case INTEGER:
                fieldValue = new FieldValue<Integer>();
                break;
            default: throw new IllegalArgumentException("Tipo Inválido");
        }
        return fieldValue;
    }
}
