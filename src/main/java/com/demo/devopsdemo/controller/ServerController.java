package com.demo.devopsdemo.controller;

import com.demo.devopsdemo.dao.ServerMapper;
import com.demo.devopsdemo.pojo.Server;
import com.demo.devopsdemo.service.GetServerService;
import com.demo.devopsdemo.service.GetServerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api",method = RequestMethod.GET)
public class ServerController {

    @Resource
    private GetServerService getServerService;

    @RequestMapping("/getUser")
    public Server ResultServer(@RequestParam(name = "id") Integer id){

        Server server = getServerService.getServer(id);
        return server;

    }
}
