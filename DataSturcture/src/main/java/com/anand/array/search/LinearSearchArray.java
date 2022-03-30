package com.anand.array.search;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String arg[]) {
		int[] arr;
		System.out.println("Enter the size !\n");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		arr = new int[size];
		System.out.println("Enter the " + size + " elements:\n");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Elements are:");
		for (int i : arr) {
			System.out.print(i);
			System.out.print(",");
		}
		System.out.println();
		System.out.print("Enter element to be searched!\n");
		int search = scanner.nextInt();
		int postion = linear_search(arr,  size, search);
		if (postion > 0)
			System.out.println(search + " element is there and position at " + postion);
		else
			System.out.println("sorry element is not there! ");
	}

	public static int linear_search(int a[], int size, int searchelement) {
		for (int i = 0; i < size; i++) {
			if (searchelement == a[i]) {
				return i;
			}
		}
		return -1;

	}
}
