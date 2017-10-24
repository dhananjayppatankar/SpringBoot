package com.dhan.bootdemo;

import org.springframework.stereotype.Component;

@Component
public interface Sort {

	public int[] sort(int[] numbers);
		
}
