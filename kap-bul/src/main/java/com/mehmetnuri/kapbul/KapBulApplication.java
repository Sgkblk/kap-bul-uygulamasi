package com.mehmetnuri.kapbul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class KapBulApplication {

    public static void main(String[] args) {
        SpringApplication.run(KapBulApplication.class, args);
    }

}
