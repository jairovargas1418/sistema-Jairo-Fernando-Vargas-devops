package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Habilita el cliente Eureka
public class UsuariosServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsuariosServiceApplication.class, args);
    }
}

