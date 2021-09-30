package com.ramana.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbasicsApplication.class, args);
		SimpleBinarySearch binarySearch = applicationContext.getBean(SimpleBinarySearch.class);
		String result = binarySearch.binarySearchService(new int[] { 12 }, 23);
		System.out.println(result);
	}

}
