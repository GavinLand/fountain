package org.fountain.fountaineureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FountainEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FountainEurekaApplication.class, args);
	}
}
