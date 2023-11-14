package com.yh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.yh.mapper")
public class MpDomeApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(MpDomeApp.class, args);
    }
}
