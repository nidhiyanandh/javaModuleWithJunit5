package com.anand.array.search.sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr1;
		System.out.println("Enter number of elements in array 1:");
		int m = scn.nextInt();
		arr1 = new int[m];
		System.out.println("Enter elements of array 1:");
		for (int s = 0; s < m; s++) {
			arr1[s] = scn.nextInt();
		}
		for (int s = 1; s < m; s++) {
			int position = s - 1;
			int minmum = arr1[s - 1];
			for (int j = s; j < m; j++) {
				if (arr1[j] < minmum) {
					minmum = arr1[j];
					position = j;
				}
			}
			if (position != s - 1) {
				int temp = arr1[position];
				arr1[position] = arr1[s-1];
				arr1[s-1] = temp;
			}
		}
		for (int j : arr1) {
			System.out.print(j + " ");
		}
	}

}
