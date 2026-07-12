package com.cognizant.apigateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.HandlerFilterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Component
public class LogFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogFilter.class);

    public HandlerFilterFunction<ServerResponse, ServerResponse> log() {

        return (request, next) -> {

            LOGGER.info("Incoming Request : {} {}",
                    request.method(),
                    request.uri());

            return next.handle(request);
        };
    }
}