package com.cognizant.springrest;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestHandsonApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringRestHandsonApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        SpringApplication.run(SpringRestHandsonApplication.class, args);
        displayCountry();
        LOGGER.info("END");
    }

    private static void displayCountry() {
        try (ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("country.xml")) {
            ApplicationContext context = xmlContext;
            Country country = context.getBean("country", Country.class);
            LOGGER.debug("Country : {}", country);
        }
    }
}
