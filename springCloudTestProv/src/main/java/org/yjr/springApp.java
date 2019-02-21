package org.yjr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class springApp {
    public static void main(String[] args) {
        SpringApplication.run(springApp.class, args);
    }
}
