package com.unq.mentiunq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class MentiUnqApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentiUnqApplication.class, args);
	}

}
