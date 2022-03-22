package com.demo.devopsdemo;

import com.demo.devopsdemo.pojo.Dog;
import com.demo.devopsdemo.pojo.Person;
import com.demo.devopsdemo.service.GetServerService;
import com.demo.devopsdemo.service.GetServerServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsDemoApplicationTests {

    @Autowired
    public GetServerService getServerService;
    @Test
    public void add(){
        Dog dog = new Dog();
        dog.setDogAge(13);
        dog.setDogName("yangyang");
        Person person = new Person();
        person.setId(1);
        person.setName("lyp");
        person.setDog(dog);
        int i = getServerService.addPerson(person);
        System.out.println(i);

    }

}
