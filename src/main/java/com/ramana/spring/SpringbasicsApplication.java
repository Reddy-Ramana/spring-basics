package com.ramana.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ramana.spring.basics.SimpleBinarySearch;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbasicsApplication.class, args);
		SimpleBinarySearch binarySearch = applicationContext.getBean(SimpleBinarySearch.class);
		SimpleBinarySearch binarySearch1 = applicationContext.getBean(SimpleBinarySearch.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		String result = binarySearch.binarySearchService(new int[] { 12 }, 23);
		System.out.println(result);
	}

}
