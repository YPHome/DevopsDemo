package com.demo.devopsdemo.controller;

import com.demo.devopsdemo.dao.ServerMapper;
import com.demo.devopsdemo.pojo.Person;
import com.demo.devopsdemo.pojo.Server;
import com.demo.devopsdemo.service.GetServerService;
import com.demo.devopsdemo.service.GetServerServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ServerController {

    @Resource
    private GetServerService getServerService;


    @RequestMapping(value="/getUser", method = RequestMethod.GET)
    public Server ResultGetServer(@RequestParam(name = "id") Integer id){

        Server server = getServerService.getServer(id);
        return server;

    }

    @RequestMapping(value="/addUser",method = RequestMethod.POST)
    public int ResultInsertServer(Server server){
        int id = 0;
        id = getServerService.addServer(server);
        return id;
    }

    @RequestMapping(value="/addPerson",method = RequestMethod.POST)
    public int ResultInsertPerson(Person person){
        int id = 0;
        id = getServerService.addPerson(person);
        return id;
    }


}
