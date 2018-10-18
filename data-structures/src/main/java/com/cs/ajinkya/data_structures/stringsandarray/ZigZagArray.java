package com.cs.ajinkya.data_structures.stringsandarray;

import java.util.Arrays;

public class ZigZagArray {
	
	public static void main(String[] args) {
		int arr[] = {4,3,7,8,6,2,1};
		int zigzag[] = zigzag(arr);
		System.out.println(Arrays.toString(zigzag));
	}

	private static int[] zigzag(int[] arr) {
		// TODO Auto-generated method stub
		boolean flag = true;
		//true means < operation and false means > operation
		int temp = 0;
		for(int i=0; i< arr.length -1 ; i++) {
			if(flag) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			else {
				if(arr[i] < arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			flag = !flag;
		}
		
		
		return arr;
	}

}
