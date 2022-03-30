package com.binary.search.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.anand.array.search.sort.SelectonSorts;

import com.binary.search.BinarySearch;

class BinarySearchTest {

	int[] values= {0,5,1,4,10,20,8,9,3,7};
	@Test
	void testBinarySearch() {
		assertTrue(
		BinarySearch.binarySearch(SelectonSorts.selectionSort(values), 0,values.length , 6) <0 );
	}

	@Test
	void testBinarySearchTest() {
		assertTrue(BinarySearch.binarySearchTest(SelectonSorts.selectionSort(values), 0,values.length , 3)>0);
	}

}
