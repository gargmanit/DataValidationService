package com.validationservice.restwebservice.validationservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ValidationServiceApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ValidationServiceApplication.class);
	public static void main(String[] args) {
		//SpringApplication.run(Valida tionServiceApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
}
}