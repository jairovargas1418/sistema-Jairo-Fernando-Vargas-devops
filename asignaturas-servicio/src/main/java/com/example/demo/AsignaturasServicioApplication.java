package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Habilita el cliente Eureka
public class AsignaturasServicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsignaturasServicioApplication.class, args);
    }
}
