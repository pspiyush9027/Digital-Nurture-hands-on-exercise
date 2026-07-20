package com.cognizant.springrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestHandsonApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringRestHandsonApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        SpringApplication.run(SpringRestHandsonApplication.class, args);
        LOGGER.info("END");
    }
}
