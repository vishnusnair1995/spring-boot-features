package com.springbootfeatures.security.LdapDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class LdapDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdapDemoApplication.class, args);
	}

}
