package com.example.ConvertJsonToObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ConvertJsonToObjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConvertJsonToObjectApplication.class, args);
	}


}
