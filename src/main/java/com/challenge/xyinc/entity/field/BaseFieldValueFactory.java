package com.challenge.xyinc.entity.field;

import java.text.ParseException;

public abstract class BaseFieldValueFactory {
    public abstract FieldValue createFieldValue(FieldType fieldType) throws ParseException;
}
