package com.audit.checklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.audit.checklist"})
@EnableFeignClients
public class ChecklistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChecklistApplication.class, args);
	}

}
