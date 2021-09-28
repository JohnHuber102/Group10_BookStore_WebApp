package com.Group10.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Determines the servlet configuration or in Spring Boot's case the Embeddeed Tomcat Server config
@SpringBootApplication
public class BookstoreApplication {

	/*
	 * Default SpringApplication class to run the Application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

}
