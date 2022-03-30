package com.binary.search;

public class BinarySearch {

	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	public static int binarySearchTest(int arr[], int start, int end, int target) {
		if (start > end)
			return -1;
		int midIndex = (start + end) / 2;
		if (arr[midIndex] == target)
			return midIndex;
		if (arr[midIndex] > target) {
			return binarySearchTest(arr, start, midIndex - 1, target);
		} else
			return binarySearchTest(arr, midIndex + 1, end, target);
	}

}
