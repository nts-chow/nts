package com.cn.nts.nts13.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Nts13Application {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String sayHey(){
        return "hi Spring Boot!!!";
    }
    public static void main(String[] args) {
        SpringApplication.run(Nts13Application.class, args);
    }

}
