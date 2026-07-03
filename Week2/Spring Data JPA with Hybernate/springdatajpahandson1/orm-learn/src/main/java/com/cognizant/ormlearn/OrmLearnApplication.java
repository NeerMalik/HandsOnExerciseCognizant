package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);

		LOGGER.info("Inside main");

		testGetAllCountries();

		try {
			testFindCountryByCode();
		} catch (CountryNotFoundException e) {
			LOGGER.error(e.getMessage());
		}

		testAddCountry();

		try {
			testUpdateCountry();
		} catch (CountryNotFoundException e) {
			LOGGER.error(e.getMessage());
		}

		testDeleteCountry();
	}


	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("Countries : {}", countries);

		LOGGER.info("End");
	}


	private static void testFindCountryByCode() throws CountryNotFoundException {

		LOGGER.info("Start");

		Country country = countryService.findCountryByCode("IN");

		LOGGER.debug("Country : {}", country);

		LOGGER.info("End");
	}


	private static void testAddCountry() {

		LOGGER.info("Start");

		Country country = new Country();

		country.setCode("XX");
		country.setName("Test Country");

		countryService.addCountry(country);

		try {

			Country addedCountry = countryService.findCountryByCode("XX");

			LOGGER.debug("Added Country : {}", addedCountry);

		} catch (CountryNotFoundException e) {

			LOGGER.error(e.getMessage());

		}

		LOGGER.info("End");
	}


	private static void testUpdateCountry() throws CountryNotFoundException {

		LOGGER.info("Start");

		countryService.updateCountry("XX", "Updated Test Country");

		Country country = countryService.findCountryByCode("XX");

		LOGGER.debug("Updated Country : {}", country);

		LOGGER.info("End");
	}


	private static void testDeleteCountry() {

		LOGGER.info("Start");

		countryService.deleteCountry("XX");

		LOGGER.info("Country with code XX deleted.");

		LOGGER.info("End");
	}
}