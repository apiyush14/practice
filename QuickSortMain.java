package com.nexeas.sort;

import java.util.Arrays;

public class QuickSortMain {

	public static void main(String[] args) {
		int[] arr= {56,23,10,54,2,1,9,24,34,234};
		arr=quickSort(arr);
		System.out.println("Arrays sorted : "+Arrays.toString(arr));
	}

	public static int[]  quickSort(int[] arr)
	{
		arr=quickSortRec(arr, 0, arr.length-1);
		return arr;
	}
	
	public static int[] quickSortRec(int[] arr,int start, int end)
	{
		if(end-start>0)
		{
			int pivot=arr[end];
			int j=start-1;
			for(int i=start;i<end;i++)
			{
				if(arr[i]<pivot)
				{
					//System.out.println("Element is : "+arr[i]+" : "+pivot);
					j++;
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
			int temp=arr[end];
			arr[end]=arr[j+1];
			arr[j+1]=temp;
			arr=quickSortRec(arr,start,j);
			arr=quickSortRec(arr,j+2,end);
		}
		return arr;
	}
}
