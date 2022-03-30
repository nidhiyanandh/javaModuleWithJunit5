package com.anand.array;

import java.util.Scanner;

public class OwnArrray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < num.length; i++) {
		num[i] = scn.nextInt(); // Inputting the values
		} // End of loop1
		System.out.println("The elements of array are: ");
		for (int i = 0; i < num.length; i++) {
		System.out.print(num[i] + "\t");
		} // End of loop2
		} // End of main

}
