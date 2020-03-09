package com.nexeas.sorting;

import java.util.Arrays;

public class HeapSortMain {

	public static void main(String[] args) {
		int[] arr= {56,23,10,54,2,1,9,24,34,234,25,4,6,12,13};
		arr=heapSort(arr);
		System.out.println("Arrays sorted : "+Arrays.toString(arr));
		}

	private static int[] heapSort(int[] arr) {
	    int n=arr.length;
	    int[] resultArr=new int[arr.length];
	    //Heapifying the tree, (n/2)-1 is the first non-leaf node
		for(int i=(n/2)-1;i>=0;i--)
		{
			heapify(arr,i,n);
		}
		
		//Start extracting max element from heap one by one and heapify again
		for(int i=0;i<n;i++)
		{
			int max=arr[0];
			resultArr[n-i-1]=max;
			arr[0]=arr[n-i-1];
			//System.out.print(max+", ");
			arr[n-i-1]=max;
			heapify(arr,0,n-i-1);
		}
		return resultArr;
	}

	private static void heapify(int[] arr, int i, int n) {
		int leftChildIndex = 2 * i + 1;
		int rightChildIndex = 2 * i + 2;
		int max = i;
		if (leftChildIndex < n && rightChildIndex < n) {
			max = arr[leftChildIndex] > arr[rightChildIndex] ? leftChildIndex : rightChildIndex;
		} else if (leftChildIndex < n) {
			max = leftChildIndex;
		} else {
			max = rightChildIndex;
		}
		if (max<n&&arr[max] > arr[i]) {
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			heapify(arr, max, n);
		}
	}

}
