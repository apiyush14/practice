package com.nexeas.sorting;

import java.util.Arrays;

public class SelectionSortMain {
 public static void main(String[] args)
 {
	 int[] arr= {4,6,1,2,3};
	 selectionSort(arr);
	 System.out.println("Sorted Array is : "+Arrays.toString(arr));
 }
 
 public static int[] selectionSort(int[] arr)
 {
	 for(int i=0;i<arr.length;i++)
	 {
		 int min=i;
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[j]<arr[min])
			 {
				min=j;
			 }
		 }
		 int temp=arr[min];
		 arr[min]=arr[i];
		 arr[i]=temp;
		 System.out.println("Sorted Array is : "+Arrays.toString(arr));
	 }
	 return arr;
 }
}
