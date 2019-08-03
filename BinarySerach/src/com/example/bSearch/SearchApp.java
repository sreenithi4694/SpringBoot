package com.example.bSearch;

import com.example.sort.BubbleSort;
import com.example.sort.QuickSort;

public class SearchApp {
	BinarySearchImpl bubbleSortSearchImpl =null;
	BinarySearchImpl quickSortSearchImpl =null;
   
	public SearchApp() {
		bubbleSortSearchImpl= new BinarySearchImpl();
		bubbleSortSearchImpl.setSortingImpl(new BubbleSort());
		
		quickSortSearchImpl= new BinarySearchImpl();
		quickSortSearchImpl.setSortingImpl(new QuickSort());
	}
public static void main(String[] args) {
	SearchApp serachApp= new SearchApp();
	serachApp.search();
}

private  void search() {
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
