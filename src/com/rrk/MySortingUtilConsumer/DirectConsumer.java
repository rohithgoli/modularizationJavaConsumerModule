package com.rrk.MySortingUtilConsumer;

import java.util.List;
import java.util.logging.Logger;

import com.rrk.sorting.algorithm.BubbleSort;

public class DirectConsumer {
	
	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());
	
	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of(
					"Mango", "Apple", "Banana", "Guava"
				));
		logger.info(sorted.toString());
	}
	
}
