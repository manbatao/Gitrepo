package com.xunyang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@ToString
@AllArgsConstructor
@NoArgsConstructor



public class Student {

    private String name;
    private int age;
}
