package com.dhan.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(BootdemoApplication.class, args);

		BinarySearchAlgo bs = ap.getBean(BinarySearchAlgo.class);

		// BinarySearchAlgo bs = new BinarySearchAlgo(new QuickSort());
		int[] num = { 1, 2, 4, 5, 5 };
		int a = bs.search(num, 3);
		System.out.println(a);

	}
}
