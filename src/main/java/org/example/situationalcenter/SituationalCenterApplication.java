package org.example.situationalcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SituationalCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SituationalCenterApplication.class, args);
    }

}
