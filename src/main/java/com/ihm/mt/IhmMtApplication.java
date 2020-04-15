package com.ihm.mt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.ihm.models")
@EnableJpaRepositories("com.ihm.dao")
public class IhmMtApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhmMtApplication.class, args);
	}

}
