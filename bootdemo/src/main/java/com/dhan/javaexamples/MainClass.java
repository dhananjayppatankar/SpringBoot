package com.dhan.javaexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Dhananjay",11,"4901 tolland");
		Customer c2 = new Customer("Dhana",12,"4902 tolland");
		Customer c3 = new Customer("Dhanan",13,"4903 tolland");
		Customer c4 = new Customer("Dhananj",14,"4904 tolland");
		Customer c5 = new Customer("Dhananja",11,"4901 tolland");
		
		List<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		Collections.sort(list);
		System.out.println(list);
		
		
		System.out.println("---------------------------Sort using id-------------------------------");
		
		Collections.sort(list, new Comparator<Customer>() {
			public int compare(Customer c1, Customer c2) {
				return c1.getId()-c2.getId();
			}
		});
		System.out.println(list);
	}

}
