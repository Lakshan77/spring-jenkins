package com.lakicode.spring_jenkins_demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJenkinsDemoApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

    @PostConstruct
    public void init() {
        logger.info("Application started....");
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsDemoApplication.class, args);
    }

}
