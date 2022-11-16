package com.example.mymovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyMovieApplication.class, args);
    }

}