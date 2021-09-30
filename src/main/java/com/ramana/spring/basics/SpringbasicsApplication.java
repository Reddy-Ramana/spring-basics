package com.ramana.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbasicsApplication.class, args);

		Sorting sorting = new QuickSort();
		SimpleBinarySearch binarySearch = new SimpleBinarySearch(sorting); 
		String result = binarySearch.binarySearchService(new int[] {12}, 23);
		System.out.println(result);
	}

}
