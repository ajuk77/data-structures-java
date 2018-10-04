package com.cs.ajinkya.data_structures.searchingalgo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 6, 7, 4, 3, 8, 9, 2, 1 };
		Arrays.sort(arr);
		int searchIndex = binarySearch(arr, 8);

		System.out.println("Number " + 2 + " found at index:" + searchIndex);
	}

	private static int binarySearch(int[] arr, int number) {
		if (null == arr || arr.length == 0) {
			return -1;
		}
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (arr[mid] == number) {
				return mid;
			} else if (arr[mid] > number) {
				high = mid - 1;
			} else if (arr[mid] < number) {
				low = mid + 1;
			}
		}

		return -1;

	}

}
