package com.nexeas.sorting;

import java.util.Arrays;

public class BubbleSortMain {

	public static void main(String[] args) {
		int[] arr= {6,2,1,4,3};
		bubbleSort(arr);
		System.out.println("Sorted array is : "+Arrays.toString(arr));
	}

	public static int[] bubbleSort(int[] arr)
	{
		boolean isSwapped=true;
		for(int i=0;i<arr.length&&isSwapped;i++)
		{
		 isSwapped=false;
		 for(int j=0;j<arr.length-i-1;j++)
		 {
			 if(arr[j]>arr[j+1])
			 {
			  int temp=arr[j];
			  arr[j]=arr[j+1];
			  arr[j+1]=temp;
			  isSwapped=true;
			 }
		 }
		}
		return arr;
	}
}
