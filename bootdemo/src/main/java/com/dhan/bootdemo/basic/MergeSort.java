package com.dhan.bootdemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("merge")
public class MergeSort implements Sort {

	@Override
	public int[] sort(int[] numbers) {

		return numbers;
	}

}
