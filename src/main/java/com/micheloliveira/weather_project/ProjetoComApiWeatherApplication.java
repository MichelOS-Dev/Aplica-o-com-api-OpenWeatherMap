package com.micheloliveira.weather_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoComApiWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoComApiWeatherApplication.class, args);
	}

}
