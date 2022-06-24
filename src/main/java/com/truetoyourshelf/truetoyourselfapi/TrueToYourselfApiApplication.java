package com.truetoyourshelf.truetoyourselfapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class TrueToYourselfApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(TrueToYourselfApiApplication.class, args);
    }

}
