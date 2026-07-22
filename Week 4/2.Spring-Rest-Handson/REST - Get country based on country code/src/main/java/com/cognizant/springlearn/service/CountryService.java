package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            List<Country> countries = getCountryList(context);

            return countries.stream()
                    .filter(country -> country.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Country code not found: " + code));
        }
    }

    @SuppressWarnings("unchecked")
    private List<Country> getCountryList(ClassPathXmlApplicationContext context) {
        return (List<Country>) context.getBean("countryList");
    }
}
