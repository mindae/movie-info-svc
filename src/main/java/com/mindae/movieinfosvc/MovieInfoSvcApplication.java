package com.mindae.movieinfosvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MovieInfoSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoSvcApplication.class, args);
	}

}
