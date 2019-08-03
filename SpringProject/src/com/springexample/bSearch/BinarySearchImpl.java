package com.springexample.bSearch;


import com.springexample.sort.Sort;

public class BinarySearchImpl {
    Sort sortingImpl=null;

	public void setSortingImpl(Sort sortingImpl) {
		this.sortingImpl = sortingImpl;
	}
	public boolean isPresent(int[] sourceNumbers, int numberToBeSearched) {
		System.out.println(" in binary search");
		sortingImpl.sort(sourceNumbers);
		System.out.println("doing search of "+numberToBeSearched);
		/**
		 * logic to search
		 */
		return true;
	}
	
	

}
