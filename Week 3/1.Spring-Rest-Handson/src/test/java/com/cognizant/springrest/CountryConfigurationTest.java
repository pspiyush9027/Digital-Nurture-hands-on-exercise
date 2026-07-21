package com.cognizant.springrest;

import com.cognizant.springlearn.Country;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryConfigurationTest {

    @Test
    void shouldLoadIndiaFromCountryXml() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            Country country = context.getBean("country", Country.class);

            assertEquals("IN", country.getCode());
            assertEquals("India", country.getName());
        }
    }
}
