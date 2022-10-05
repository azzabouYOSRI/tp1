package com.example.AppDepartement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author YOSRI AZABOU
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.example.AppDepartement.entities"})
public class Tp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

}