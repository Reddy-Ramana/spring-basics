package com.ramana.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimpleBinarySearch {

	@Autowired
	@Qualifier("quick")
	private Sorting sort;

	public String binarySearchService(int[] Numbers, int result) {

		return sort.sort(Numbers, result);
	}

}
