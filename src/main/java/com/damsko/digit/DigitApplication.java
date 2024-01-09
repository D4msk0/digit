package com.damsko.digit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.damsko.digit")
public class DigitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitApplication.class, args);
	}

}
