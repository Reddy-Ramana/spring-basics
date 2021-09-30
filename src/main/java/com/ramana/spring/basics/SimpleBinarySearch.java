package com.ramana.spring.basics;

public class SimpleBinarySearch {

	private Sorting sorting;

	public SimpleBinarySearch(Sorting sorting) {
		super();
		this.sorting = sorting;
	}

	public void setSorting(Sorting sorting) {
		this.sorting = sorting;
	}

	public String binarySearchService(int[] Numbers, int result) {

		return sorting.sort(Numbers, result);
	}

}
