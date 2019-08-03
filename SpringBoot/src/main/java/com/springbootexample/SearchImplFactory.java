package com.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbootexample.bSearch.BinarySearchImpl;
import com.springbootexample.sort.Sort;

@Configuration
public class SearchImplFactory {
    @Autowired
    Sort bubbleSort;
    
    @Autowired
    Sort quickSort;
	
	
	@Bean
	public BinarySearchImpl bubbleSortSearchImpl() {
		return new BinarySearchImpl(bubbleSort);
	}
	
	@Bean 
	public BinarySearchImpl quickSortSearchImpl() {
		return new BinarySearchImpl(quickSort);
	}
}
