package com.shreyash.RestCrudOperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * What needs improvement
 *
 * Learn more about Spring MVC architecture
 * What is difference between static and template and why I m not able to access the file in static directly.
 * Using MVC architecture, how to provide Model, View and Controller to get the data into html page.
 * Learn more about usage of logging.
 */

@SpringBootApplication
public class RestCrudOperationsApplication {

	private static Logger logger = LoggerFactory.getLogger(RestCrudOperationsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(RestCrudOperationsApplication.class, args);
		logger.error("This is error log");
		logger.warn("This is warn log");
		logger.info("This is info log");
		logger.debug("This is debug log");
	}

}
