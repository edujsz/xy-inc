package com.challenge.xyinc.entity;

import com.challenge.xyinc.entity.field.Field;
import lombok.Data;

import java.util.Set;

@Data
public class Model {

    private Long id;

    private String name;

    private Set<Field> fields;

}
