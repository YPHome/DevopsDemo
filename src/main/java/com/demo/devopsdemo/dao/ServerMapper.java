package com.demo.devopsdemo.dao;

import com.demo.devopsdemo.pojo.Server;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;



public interface ServerMapper {

    Server server = null;
    Server selectById(@Param("id") Integer id);

    /**
    int insertServer(@Param("id") Integer id,
               @Param("hostname") String hostname,
               @Param("ip") String ip,
               @Param("os") String os,
               @Param("version") String version,
               @Param("location") String location,
               @Param("status") String status
               );
   */

    //int insertServer(Server server);
}



