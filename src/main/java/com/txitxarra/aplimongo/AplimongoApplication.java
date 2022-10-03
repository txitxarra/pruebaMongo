package com.txitxarra.aplimongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class AplimongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplimongoApplication.class, args);
	}

}
