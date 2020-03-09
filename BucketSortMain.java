package com.nexeas.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BucketSortMain {

	public static void main(String[] args) {
		double[] arr= {0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434};;
		bucketSort(arr);
		//System.out.println("Sorted array is : "+Arrays.toString(arr));
	}

	private static void bucketSort(double[] arr) {
	   List[] listArr=new ArrayList[arr.length];
	   for(int i=0;i<listArr.length;i++)
	   {
		   listArr[i]=new ArrayList();
	   }
	   for(int i=0;i<arr.length;i++)
	   {
		   int bucket=(int) (arr[i]*10)/listArr.length;
		   listArr[bucket].add(arr[i]);
	   }
	   
	   for(int i=0;i<listArr.length;i++)
	   {
		 listArr[i].sort(Comparator.naturalOrder());
	   }
	   
	   for(int i=0;i<listArr.length;i++)
	   {
		 for(int j=0;j<listArr[i].size();j++)
		 {
			 System.out.print(listArr[i].get(j)+", ");
		 }
	   }
	}

	}
