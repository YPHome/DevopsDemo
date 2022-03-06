package com.demo.devopsdemo.pojo;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;


@Data
public class Server implements Serializable {
    private Integer id;

    private String hostname;

    private String ip;

    private String os;

    private String version;

    private String location;

    private String status;


}