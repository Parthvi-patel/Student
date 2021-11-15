package com.salesProject.Sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class SalesApplication {

	public static void main(String[] args) {

		System.out.println("Database connected successfully....");
		SpringApplication.run(SalesApplication.class, args);
	}


}
