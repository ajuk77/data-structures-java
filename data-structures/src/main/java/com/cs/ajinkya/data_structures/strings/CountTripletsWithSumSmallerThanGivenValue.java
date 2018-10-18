package com.cs.ajinkya.data_structures.strings;

import java.util.Arrays;

/*
 * 
 * Ref: https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/
 * Time complexity o(n^2)
 */
public class CountTripletsWithSumSmallerThanGivenValue {
	
	public static void main(String[] args) {
		int arr[] = {5,1,3,4,7};
		int triplets = countTriplets(arr, 12);
		System.out.println("Number of triplets :" + triplets);
		
		int arr2[] = {-2,0,1,3};
		System.out.println("Number of triplets :"+ countTriplets(arr2, 2));
		
	}
	
	public static int countTriplets(int arr[], int sum) {
		if(arr.length == 0) {
			return 0;
		}
		int ans = 0;
		Arrays.sort(arr);
		int i,j,k;
		int n =  arr.length;
		for(i=0; i<n-2; i++) {
			j = i+1;
			k = n-1;
			while(j<k) {
				if((arr[i] + arr[j] + arr[k])>=sum) {
					k--;
				} else {
					ans += (k-j);
					j++;
				}
			}
		}
		return ans;
	}

}
