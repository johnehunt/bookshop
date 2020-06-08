package com.jjh.bookshop.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.jjh.bookshop.controller,com.jjh.bookshop.service")
@EntityScan("com.jjh.bookshop.domain")
@EnableJpaRepositories("com.jjh.bookshop.repository")
public class BookshopApplication {

	public static void main(String[] args) {
		System.out.println("Starting Bookshop setup");
		SpringApplication.run(BookshopApplication.class, args);
		System.out.println("Finished Bookshop setup");
		System.out.println("For Service see - http://localhost:8080/bookshop/list");
		System.out.println("For WebSite see - http://localhost:8080/index.html");
	}

}
