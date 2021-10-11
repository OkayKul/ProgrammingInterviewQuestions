package com.omkarkulkarni;

public class PrintFirstNonRepeatingCharacteroFString {
	// Print the first non repeating character of the string
	public static void main(String[] args) {
		String str = "Lava is the language";
		String str1 = str.toLowerCase();
		
		// Approach 1
		for(Character ch : str1.toCharArray() ) {
			if (str1.indexOf(ch) == str1.lastIndexOf(ch)) {
				System.out.println("the non repeating character is :: " + ch);
				break;
			}
		}
	}
}
