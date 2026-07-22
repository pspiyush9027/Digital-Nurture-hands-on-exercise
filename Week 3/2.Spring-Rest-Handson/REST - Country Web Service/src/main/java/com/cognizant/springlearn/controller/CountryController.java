package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping(value = "/country", produces = MediaType.APPLICATION_JSON_VALUE)
    public Country getCountryIndia() {
        LOGGER.info("Loading India from country.xml");

        try (ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("country.xml")) {
            ApplicationContext context = xmlContext;
            return context.getBean("countryIndia", Country.class);
        }
    }
}
