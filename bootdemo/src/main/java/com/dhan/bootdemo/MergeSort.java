package com.dhan.bootdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MergeSort implements Sort {

	@Override
	public int[] sort(int[] numbers) {

		return numbers;
	}

}
