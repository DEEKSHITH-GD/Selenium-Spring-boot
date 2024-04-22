package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

import com.destination.seleniumTest.AutomationApplication;

@TestConfiguration(proxyBeanMethods = false)
public class TestAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.from(AutomationApplication::main).with(TestAutomationApplication.class).run(args);
	}

}
