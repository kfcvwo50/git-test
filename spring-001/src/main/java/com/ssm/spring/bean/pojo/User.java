package com.ssm.spring.bean.pojo;

import lombok.Data;

@Data
public class User {
    private int age;
    private int height;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
