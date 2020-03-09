package com.nexeas.sorting;

import java.util.Arrays;

public class InsertionSortMain {

	public static void main(String[] args) {
      int[] arr= {5,4,1,3,2,6};
      insertionSort(arr);
      System.out.println("Sorted array is : "+Arrays.toString(arr));
	}

	public static int[] insertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i;
			while(j>0)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				j--;
			}
		}
		return arr;
	}
}
