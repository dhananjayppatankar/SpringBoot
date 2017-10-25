package com.dhan.bootdemo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BinarySearchAlgo {

	@Autowired
	@Qualifier("merge")
	private Sort quickSort;

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
		int[] n = quickSort.sort(numbers);
		return 3;

	}

}
