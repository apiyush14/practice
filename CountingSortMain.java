package com.nexeas.sort;

import java.util.Arrays;

public class CountingSortMain {

	public static void main(String[] args) {
		 int[] arr= {1,4,1,2,7,5,2};
	     arr=countSort(arr);
	     System.out.println("Result is : "+Arrays.toString(arr));
	}

	private static int[] countSort(int[] arr) 
	{
		int[] countArr=new int[10];
		int[] resultArr=new int[arr.length];
		for(int i=0;i<countArr.length;i++)
		{
			countArr[i]=0;
		}
		for(int i=0;i<arr.length;i++)
		{
			countArr[arr[i]]++;
		}
		int sum=0;
		for(int i=0;i<countArr.length;i++)
		{
			sum=sum+countArr[i];
			countArr[i]=sum;
		}
		for(int i=0;i<arr.length;i++)
		{
		  resultArr[countArr[arr[i]]-1]=arr[i];
		  countArr[arr[i]]--;
		}
		return resultArr;
	}

}
