package com.challenge.xyinc.entity.field;

public class FieldValue<T> {

    private String name;

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}