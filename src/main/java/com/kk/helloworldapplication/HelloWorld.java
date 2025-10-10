package com.kk.helloworldapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorld {

    @Value("${env.username}")
    private String username;

    @RequestMapping("/")
    String home() {
        return "Hello World! Enjoy "+ this.username;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }

}
