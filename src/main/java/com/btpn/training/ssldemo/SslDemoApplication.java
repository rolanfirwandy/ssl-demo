package com.btpn.training.ssldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
public class SslDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SslDemoApplication.class, args);
    }

    @RestController
    class SecuredServerController{
        @RequestMapping("/secured")
        public String secured(){
            System.out.println("Inside secured()");
            return "Hello user: " + new Date();
        }
    }
}
