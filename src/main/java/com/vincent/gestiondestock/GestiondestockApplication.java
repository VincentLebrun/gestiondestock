package com.vincent.gestiondestock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//to exclude the token make the annotation with this exclusion
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GestiondestockApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestiondestockApplication.class, args);
	}

}
