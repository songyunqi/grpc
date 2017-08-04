package com.foo.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by Yang on 2017/8/4.
 */
@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(BootApplication.class, args);
    }
}
