package com.cognizant.springlearn.dao;

import com.cognizant.springlearn.model.Country;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CountryDao {

    private static final List<Country> countryList = new ArrayList<>();

    static {
        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("JP", "Japan"));
        countryList.add(new Country("AU", "Australia"));
    }

    public List<Country> getAllCountries() {
        return countryList;
    }

    public Country getCountry(String code) {
        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public Country addCountry(Country country) {
        countryList.add(country);
        return country;
    }

    public Country updateCountry(Country country) {

        for (int i = 0; i < countryList.size(); i++) {

            if (countryList.get(i).getCode().equalsIgnoreCase(country.getCode())) {
                countryList.set(i, country);
                return country;
            }

        }

        return null;
    }

    public boolean deleteCountry(String code) {

        return countryList.removeIf(c ->
                c.getCode().equalsIgnoreCase(code));

    }

}