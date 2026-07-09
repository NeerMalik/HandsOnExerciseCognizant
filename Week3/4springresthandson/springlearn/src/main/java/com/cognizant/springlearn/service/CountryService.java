package com.cognizant.springlearn.service;

import com.cognizant.springlearn.dao.CountryDao;
import com.cognizant.springlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public List<Country> getAllCountries() {
        return countryDao.getAllCountries();
    }

    public Country getCountry(String code) {
        return countryDao.getCountry(code);
    }

    public Country addCountry(Country country) {
        return countryDao.addCountry(country);
    }

    public Country updateCountry(Country country) {
        return countryDao.updateCountry(country);
    }

    public boolean deleteCountry(String code) {
        return countryDao.deleteCountry(code);
    }
}