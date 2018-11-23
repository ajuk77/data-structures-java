package com.cs.ajinkya.data_structures.cicd;

import java.util.HashMap;
import java.util.Map;

public class Prog1IsUniqueChar {
	
	public static void main(String[] args) {
		
		String str = "abcd";
		String str2 = "nnvxknvlsdfjaijfas";
		System.out.println("Does string1 conaints unique characters? -> " + isUniqueChar(str));
		System.out.println("Does string2 contains unique characters? -> "+ isUniqueChar(str2));
		
	}
	
	/**
	 * Time complexity is o(n) and space complexity is o(n)
	 * 
	 * If we are not allowed to use any data structures, the we will have to compare a character with all other characters
	 * So the worst case time complexity would be o(n^2) and space would be o(1)
	 * 
	 * Third approach is to sort an array with o(nlogn) and compare adjacent charcters
	 * @param str
	 * @return
	 */
	
	public static boolean isUniqueChar(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		if(str.length() > 128) {
			return false;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(null != map.get(str.charAt(i))) {
				return false;
			}
			map.put(str.charAt(i), 1);
		}
		return true;
	}

}
