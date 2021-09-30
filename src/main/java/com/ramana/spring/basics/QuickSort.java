package com.ramana.spring.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements Sorting {

	public String sort(int[] numbers, int numberToSearch) {

		return "Returned for QuickSort sort";

	}
}
