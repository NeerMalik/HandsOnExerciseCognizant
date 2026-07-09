package com.cognizant.springlearn.service;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.model.CountryList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    public List<Country> getAllCountries() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        CountryList countryList =
                context.getBean("countryList", CountryList.class);

        return countryList.getCountryList();
    }

    public Country getCountry(String code) throws CountryNotFoundException {

        List<Country> countries = getAllCountries();

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        throw new CountryNotFoundException();

    }

}