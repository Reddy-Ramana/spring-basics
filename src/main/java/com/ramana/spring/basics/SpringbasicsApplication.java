package com.ramana.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbasicsApplication.class, args);

		SimpleBinarySearch binarySearch = new SimpleBinarySearch();
		int result = binarySearch.binarySearchService(new int [] {12,13,14}, 13);
		System.out.println(result);
	}

}
