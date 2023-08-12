package com.xunyang.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

@Data
public class Cat {

    @Value("${student.name}")
    private String name;
    @Value("${student.age}")
    private int age;
}
