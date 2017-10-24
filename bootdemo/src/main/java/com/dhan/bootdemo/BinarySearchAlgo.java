package com.dhan.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchAlgo {

	@Autowired
	private Sort mergeSort;

//	public BinarySearchAlgo(Sort sort) {
//
//		this.mergeSort = sort;
//	}
//
//	public Sort getSort() {
//		return mergeSort;
//	}
//
//	public void setSort(Sort sort) {
//		this.mergeSort = sort;
//	}

	public int search(int[] numbers, int a) {

		// Use sort Algorithm
		int[] n = mergeSort.sort(numbers);
		return 3;

	}

}
