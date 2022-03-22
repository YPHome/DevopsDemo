package com.demo.devopsdemo.service;

import com.demo.devopsdemo.dao.PersonMapper;
import com.demo.devopsdemo.dao.ServerMapper;
import com.demo.devopsdemo.pojo.Person;
import com.demo.devopsdemo.pojo.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class GetServerServiceImpl implements GetServerService{

    @Resource
    private ServerMapper serverMapper;

    @Resource
    private PersonMapper personMapper;


    @Override
    public Server getServer(Integer id) {

        Server server = serverMapper.selectById(id);
        return server;
    }

    @Override
    public int addServer(Server server) {
        int id = 0;
        id = serverMapper.insertServer(server);
        return id;

    }

    @Override
    public int addPerson(Person person) {
        int num = 0;
        num = personMapper.insertPerson(person);
        return num;
    }


}


