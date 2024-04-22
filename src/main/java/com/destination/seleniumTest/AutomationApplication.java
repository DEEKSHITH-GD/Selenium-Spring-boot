package com.destination.seleniumTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.destination.seleniumTest.entity.SeleniumTest;

@SpringBootApplication
public class AutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationApplication.class, args);
		SeleniumTest.webDriver();
	}

}
