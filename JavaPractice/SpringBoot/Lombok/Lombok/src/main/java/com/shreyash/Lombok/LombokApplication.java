package com.shreyash.Lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {

		SpringApplication.run(LombokApplication.class, args);
		Person person = new Person(1, "Shreyash");
		Person person2 = new Person();

		person2.setName("Shreyash");
		System.out.println(person.getName());
	}

}
