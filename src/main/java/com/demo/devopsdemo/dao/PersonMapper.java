package com.demo.devopsdemo.dao;

import com.demo.devopsdemo.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {

    int insertPerson(Person person);
}
