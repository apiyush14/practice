package com.nexeas.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 56, 23, 63, 1, 8, 9, 78, 65, 32, 7, 6,24 };
		//int[] arr = { 5, 2, 56, 23, 63, 1};
		arr=mergeSort(arr);
		System.out.println("Sorted array is : "+Arrays.toString(arr));
	}

	public static int[] mergeSort(int[] arr)
	{
		arr=mergeSortRec(arr, 0, arr.length);
		return arr;
	}
	
	public static int[] mergeSortRec(int[] arr,int start, int end)
	{
		if(end-start<=1)
		{
			int[] temp=new int[1];
			temp[0]=arr[start];
			return temp;
		}
		int mid=start+((end-start)/2);
		int[] left=new int[mid-start];
		int[] right=new int[end-mid];
		for(int i=start;i<mid;i++)
		{
			left[i-start]=arr[i];
		}
		for(int i=mid;i<end;i++)
		{
			right[i-mid]=arr[i];
		}
		left=mergeSortRec(arr, start, mid);
		right=mergeSortRec(arr,mid,end);
		arr=mergeArr(left, right);
		return arr;
	}
	
	public static int[] mergeArr(int[] left,int[] right)
	{
		int[] arr=new int[left.length+right.length];
		int leftIndex=0;
		int rightIndex=0;
		int ptr=0;
		while(leftIndex<left.length&&rightIndex<right.length)
		{
			if(left[leftIndex]<right[rightIndex])
			{
				arr[ptr]=left[leftIndex];
				leftIndex++;
			}
			else if(left[leftIndex]>right[rightIndex])
			{
				arr[ptr]=right[rightIndex];
				rightIndex++;
			}
			ptr++;
		}
		
		while(leftIndex<left.length)
		{
			arr[ptr]=left[leftIndex];
			leftIndex++;
			ptr++;
		}
		while(rightIndex<right.length)
		{
			arr[ptr]=right[rightIndex];
			rightIndex++;
			ptr++;
		}
		return arr;
	}
}
