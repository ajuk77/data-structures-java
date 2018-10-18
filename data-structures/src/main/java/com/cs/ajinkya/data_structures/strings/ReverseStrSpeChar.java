package com.cs.ajinkya.data_structures.strings;
/*
 * Hint: https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
 * 
 */
public class ReverseStrSpeChar {
	
	public static void main(String[] args) {
		String s1 = "a,b$c";
		String s2 = "Ab,c,de!$";
		
		System.out.println("Reverse string of " + s1 + " is " + reverse(s1));
		System.out.println("Reverse string of " + s2 + " is " + reverse(s2));
		
	}

	public static String reverse(String str) {
		String reverse = "";
		if(str.isEmpty()) {
			return reverse;
		}
		int low = 0;
		char ch[] = str.toCharArray();
		int high = ch.length - 1;
		while(low<high) {
			if(!Character.isAlphabetic(ch[low])) {
				low++;
			} 
			else if(!Character.isAlphabetic(ch[high])) {
				high--;
			}
			else {
				char temp = ch[low];
				ch[low] = ch[high];
				ch[high] = temp;
				low++;
				high--;
			}
			
			
		}
		reverse = new String(ch);
		return reverse;
	}


}
