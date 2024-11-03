package org.example.bankaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "Repository")
@EntityScan(basePackages = "Entity")
public class BankaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankaProjectApplication.class, args);
    }

}
