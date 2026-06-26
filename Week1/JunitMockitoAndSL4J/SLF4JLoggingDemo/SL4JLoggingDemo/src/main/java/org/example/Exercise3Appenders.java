package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise3Appenders {

    private static final Logger logger =
            LoggerFactory.getLogger(Exercise3Appenders.class);

    public static void main(String[] args) {

        logger.trace("This is TRACE message");

        logger.debug("This is DEBUG message");

        logger.info("This is INFO message");

        logger.warn("This is WARN message");

        logger.error("This is ERROR message");

    }
}