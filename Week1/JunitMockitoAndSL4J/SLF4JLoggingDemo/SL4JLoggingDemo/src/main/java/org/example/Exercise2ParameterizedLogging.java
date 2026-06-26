package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise2ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(Exercise2ParameterizedLogging.class);

    public static void main(String[] args) {

        String name = "Neer";
        int age = 20;
        double salary = 50000;

        logger.info("Employee Name : {}", name);

        logger.info("Employee Age : {}", age);

        logger.info("Employee Salary : {}", salary);

        logger.info("Employee {} is {} years old.", name, age);

    }
}