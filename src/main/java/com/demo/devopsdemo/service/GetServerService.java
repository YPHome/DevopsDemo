package com.demo.devopsdemo.service;


import com.demo.devopsdemo.pojo.Server;
import org.springframework.stereotype.Service;


public interface GetServerService {

    Server getServer(Integer id);
    int addServer(Server server);
}
