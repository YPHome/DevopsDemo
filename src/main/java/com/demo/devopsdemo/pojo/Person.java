package com.demo.devopsdemo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private Integer id;
    private String name;
    private Dog dog;

}
