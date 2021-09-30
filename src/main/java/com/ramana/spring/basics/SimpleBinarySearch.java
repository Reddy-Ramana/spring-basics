package com.ramana.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleBinarySearch {

	@Autowired
	private Sorting sorting;

	public String binarySearchService(int[] Numbers, int result) {

		return sorting.sort(Numbers, result);
	}

}
