package com.prp.server.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PrpServerGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrpServerGatewayApplication.class, args);
    }

}
