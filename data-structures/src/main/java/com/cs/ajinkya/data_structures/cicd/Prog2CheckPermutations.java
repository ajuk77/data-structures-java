package com.cs.ajinkya.data_structures.cicd;

import java.util.Arrays;

public class Prog2CheckPermutations {

	public static void main(String[] args) {
		
		String source = "God";
		String dest = "dog";
		System.out.println(checkPermutationsUsingArray(source, dest));
		System.out.println(checkPermutationsUsingSorting(source, dest));
		
		String src2 = "GOD  ";
		String dest2 = "  DOG";
		System.out.println(checkPermutationsUsingArray(src2, dest2));
		System.out.println(checkPermutationsUsingSorting(src2, dest2));

	}
	/**
	 * Here we assume that the string is case sensitive means - God is not equal to dog
	 * There are multiple spaces in the string
	 * @param source
	 * @param destination
	 * @return
	 */
	public static boolean checkPermutationsUsingSorting(String source, String destination) {
		if ((null == source && null == destination) || (source.isEmpty() && destination.isEmpty())) {
			return true;
		} else if (source.length() != destination.length()) {
			return false;
		}

		String sortedSource = sort(source);
		return sortedSource.equals(sort(destination));
	}

	private static String sort(String source) {
		char[] ch = source.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	
	public static boolean checkPermutationsUsingArray(String source, String destination) {
		//assuming 128 ASCII chars
		if ((null == source && null == destination) || (source.isEmpty() && destination.isEmpty())) {
			return true;
		} else if (source.length() != destination.length()) {
			return false;
		}
		
		int arr[] = new int[128];
		char src[] = source.toCharArray();
		for(char ch: src) {
			arr[ch]++;
		}
		
		for(int i=0; i<destination.length(); i++) {
			int character = destination.charAt(i);
			arr[character]--;
			if(arr[character] < 0) {
				return false;
			}
		}
		return true;
	}

}
