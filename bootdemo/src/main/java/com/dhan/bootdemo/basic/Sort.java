package com.dhan.bootdemo.basic;

import org.springframework.stereotype.Component;

@Component
public interface Sort {

	public int[] sort(int[] numbers);
		
}
