package com.ramana.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements Sorting {

	public String sort(int[] numbers, int numberToSearch) {

		return "Returned for BubbleSort sort";

	}
}
