package com.anand.array.search.test.sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.anand.array.search.sort.SelectonSorts;

class SelectonSortsTest {

	int[] notorderdvalues = {0,5,1,4,10,20,8,9,3,7};
	int[] orderedvalues =   {0,1,3,4,5,7,8,9,10,20};
	@Test
	void testSelectionSort() {
		int [] result=SelectonSorts.selectionSort(notorderdvalues);
		assertEquals(result,notorderdvalues);
	}

}
