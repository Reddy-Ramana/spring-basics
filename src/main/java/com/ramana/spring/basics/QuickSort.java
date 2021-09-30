package com.ramana.spring.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements Sorting {

	public String sort(int[] numbers, int numberToSearch) {

		return "Returned for QuickSort sort";

	}
}
