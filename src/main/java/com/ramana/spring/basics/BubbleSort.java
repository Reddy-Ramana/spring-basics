package com.ramana.spring.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements Sorting {

	public String sort(int[] numbers, int numberToSearch) {

		return "Returned for BubbleSort sort";

	}
}
