package com.cs.ajinkya.data_structures.searchingalgo;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {5,4,7,6,2,9,1};
		int searchIndex = linearsearch(arr, 6);
		System.out.println("Element " + 6 + " found at index:" + searchIndex);
	}

	private static int linearsearch(int[] arr, int key) {
		if(null == arr || arr.length == 0) {
			return -1;
		}
		for(int i=0; i<arr.length; i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
