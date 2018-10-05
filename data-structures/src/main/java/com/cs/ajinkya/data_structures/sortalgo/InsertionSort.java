package com.cs.ajinkya.data_structures.sortalgo;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 6, 7, 4, 3, 8, 9, 2, 1 };
		System.out.println("After sorting");
		arr = insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int[] insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		if(null == arr || arr.length == 0 || arr.length == 1) {
			return arr;
		}
		int i, j;
		int key = 0;
		for(i =1; i<arr.length; i++) {
			key = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
				
			}
			arr[j+1] = key;
		}
		return arr;
	}

}
