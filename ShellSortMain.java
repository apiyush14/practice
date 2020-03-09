package com.nexeas.sorting;

import java.util.Arrays;

public class ShellSortMain {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 56, 23, 63, 1, 8, 9, 78, 65, 32, 5, 6 };
		shellSort(arr);
		System.out.println("Sorted Array is : " + Arrays.toString(arr));
	}

	public static int[] shellSort(int[] arr) {
		int h = arr.length / 9;
		for (h = 3 * h + 1; h > 0; h = h / 3) {
			System.out.println("H value is : "+h);
			for (int i = 0; i < arr.length; i=i+h) {
				int j = i;
				while (j-h>=0) {
					if (arr[j - h] > arr[j]) 
					{
						System.out.println("Comparing values : "+arr[j-h]+" : "+arr[j]);
						int temp = arr[j];
						arr[j] = arr[j - h];
						arr[j - h] = temp;
					}
					j=j-h;
				}
			}
		}
		return arr;
	}

}
