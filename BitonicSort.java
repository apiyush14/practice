package com.nexeas.sort;

import java.util.Arrays;

public class BitonicSort {
 public static void main(String[] args)
 {
	 int[] arr= {3,7,4,8,6,2,1,5};
	 arr=getBitonicSequence(arr);
	 System.out.println("Bitonic Sequence : "+Arrays.toString(arr));
 }
 
 public static int[] getBitonicSequence(int[] arr)
 {
	 arr=getBitonicSequenceRec(arr,0,arr.length-1,1);
	 return arr;
 }
 
 public static int[] getBitonicSequenceRec(int[] arr,int start, int end,int direction)
 {
	 if(end-start>1)
	 {
		 int mid=start+(end-start)/2;
		 getBitonicSequenceRec(arr, start, mid, 1);
		 getBitonicSequenceRec(arr,mid+1,end,0);
		 sortSequenceRec(arr,start,mid,1);
		 sortSequenceRec(arr,mid+1,end,0);
	 }
	 sortSequenceRec(arr, start, end, direction);
	 return arr;
 }

private static void sortSequenceRec(int[] arr, int start, int end, int dir) {
    if(end-start>0)
    {
    int mid=(end-start)/2;	
	for(int i=start;i<start+mid+1;i++)
	{
		compareAndSwap(arr,i,i+mid+1,dir);
	}
	sortSequenceRec(arr,start,start+mid,dir);
	sortSequenceRec(arr,start+mid+1,end,dir);
    }
}

private static void compareAndSwap(int[] arr, int i, int j, int dir) 
{
	if(arr[i]>arr[j]&&dir==1||arr[i]<arr[j]&&dir==0)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
}
