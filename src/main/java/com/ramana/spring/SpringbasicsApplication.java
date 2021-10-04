package com.ramana.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ramana.spring.basics.SimpleBinarySearch;

@Configuration
@ComponentScan
public class SpringbasicsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
		SimpleBinarySearch binarySearch = applicationContext.getBean(SimpleBinarySearch.class);
		SimpleBinarySearch binarySearch1 = applicationContext.getBean(SimpleBinarySearch.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		String result = binarySearch.binarySearchService(new int[] { 12 }, 23);
		System.out.println(result);
	}

}
