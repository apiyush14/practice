package com.nexeas.sorting;

import java.util.Arrays;

public class RadixSortMain {

	public static void main(String[] args) {
		int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
		arr=radixSort(arr);
		System.out.println("Sorted array is : "+Arrays.toString(arr));
	}
	
	private static int getMax(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	private static int[] radixSort(int[] arr) {
		int max=getMax(arr);
		for(int exp=1;max/exp>0;exp=exp*10)
		{
			arr=countSort(arr,exp);
		}
		return arr;
	}

	private static int[] countSort(int[] arr, int exp) {
		int[] countArr=new int[10];
		int[] outArr=new int[arr.length];
		for(int i=0;i<countArr.length;i++)
		{
			countArr[i]=0;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			countArr[(arr[i]%(10*exp))/exp]++;
		}
		
		int sum=0;
		for(int i=0;i<countArr.length;i++)
		{
		 sum=sum+countArr[i];
		 countArr[i]=sum;
		}
		//Need to run in opposite direction to make it stable which is a need to sort it correctly for radix sort
		for(int i=arr.length-1;i>=0;i--)
		{
			outArr[countArr[(arr[i]%(10*exp))/exp]-1]=arr[i];
			countArr[(arr[i]%(10*exp))/exp]--;
		}
		return outArr;
	}

}
