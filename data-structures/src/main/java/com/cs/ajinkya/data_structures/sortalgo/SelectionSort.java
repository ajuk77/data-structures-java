package com.cs.ajinkya.data_structures.sortalgo;

public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[] = { 6, 7, 4, 3, 8, 9, 2, 1 };
		System.out.println("After sorting");
		arr = selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] selectionSort(int arr[]) {
		if(null == arr || arr.length == 0) {
			return arr;
		}
		int minimum = 0;
		int temp = 0;
		int i, j;
		for(i=0;i<arr.length-1;i++) {
			minimum = i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]< arr[minimum]) {
					minimum = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
		return arr;
	}

}
