package com.FulfilmentCenter.FulfilmentCenter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("Pojos")
public class FulfilmentCenter1Application {

	public static void main(String[] args) {
		SpringApplication.run(FulfilmentCenter1Application.class, args);
	}

}
