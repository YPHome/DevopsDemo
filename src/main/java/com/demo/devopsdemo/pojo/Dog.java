package com.demo.devopsdemo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dog implements Serializable {
    private String dogName;
    private int dogAge;
}
