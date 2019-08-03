package com.springbootexample.bSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringSearchApp {
	@Autowired
	BinarySearchImpl bubbleSortSearchImpl =null;
	@Autowired
	BinarySearchImpl quickSortSearchImpl =null;
/*
	public void setBubbleSortSearchImpl(BinarySearchImpl bubbleSortSearchImpl) {
		this.bubbleSortSearchImpl = bubbleSortSearchImpl;
	}

	public void setQuickSortSearchImpl(BinarySearchImpl quickSortSearchImpl) {
		this.quickSortSearchImpl = quickSortSearchImpl;
	}*/


public  void search() {
	int [] searchNumbers={1,5,4,7,8};
	performBubbleSortBasedSearch(searchNumbers);
	performQuickSortBasedSearch(searchNumbers);
}

private  void performQuickSortBasedSearch(int [] searchNumbers) {
	boolean isPresentForQuickSort = quickSortSearchImpl.isPresent(searchNumbers, 7);
	System.out.println("Completig search the serach with quick "+isPresentForQuickSort);
}



private  void performBubbleSortBasedSearch(int [] searchNumbers) {
	boolean isPresentForBubbleSort = bubbleSortSearchImpl.isPresent(searchNumbers, 7);
	System.out.println("Completig search the serach with bubble "+isPresentForBubbleSort);
}



}
