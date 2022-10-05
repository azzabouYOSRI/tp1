package com.example.AppDepartement;

import com.example.AppDepartement.entities.Departement;
import com.example.AppDepartement.repository.DepartementRepository;
import org.hibernate.criterion.IdentifierProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author YOSRI AZABOU
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.example.AppDepartement.entities"})
public class Tp1Application implements CommandLineRunner {
    private  DepartementRepository departementRepository;

    @Autowired
    private DepartementRepository dep;
    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        dep.save(new Departement(0,"Informatique"));
    }
}