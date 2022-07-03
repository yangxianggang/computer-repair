package com.example.computerrepair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ComputerRepairApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerRepairApplication.class, args);
    }

}
