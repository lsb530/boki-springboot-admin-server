package com.boki.bokispringbootadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class BokiSpringbootAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BokiSpringbootAdminServerApplication.class, args);
    }

}
