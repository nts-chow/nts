package com.cn.nts.nts13.root;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(classes =Nts13Application.class,webEnvironment =SpringBootTest.WebEnvironment.RANDOM_PORT )
class Nts13ApplicationTests {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Test
    void contextLoads() throws Exception {
        this.base=new URL("http://localhost:"+port+"/");
        ResponseEntity<String> response =template.getForEntity(base.toString(),String.class);
        assertThat(response.getBody().equals("hi Spring Boot!!!"));
    }
}
