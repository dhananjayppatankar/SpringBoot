package com.scope;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dhan.bootdemo.PersonDao;



@SpringBootApplication
public class BootScope {

	private static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(BootScope.class);

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(BootScope.class, args);

		PersonDao personDao = ap.getBean(PersonDao.class);
		PersonDao personDao1 = ap.getBean(PersonDao.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcconnection());
		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcconnection());
	}
}	
// BinarySearchAlgo bs = ap.getBean(BinarySearchAlgo.class);
// BinarySearchAlgo bs1 = ap.getBean(BinarySearchAlgo.class);
//
// System.out.println(bs);
// System.out.println(bs1);
//// BinarySearchAlgo bs = new BinarySearchAlgo(new QuickSort());
// int[] num = { 1, 2, 4, 5, 5 };
// int a = bs.search(num, 3);
// System.out.println(a);
