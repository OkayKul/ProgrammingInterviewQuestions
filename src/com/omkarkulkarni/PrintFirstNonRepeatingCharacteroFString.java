package com.omkarkulkarni;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNonRepeatingCharacteroFString {
	// Print the first non repeating character of the string
	public static void main(String[] args) {
		String str = "Lava is the language";
		String str1 = str.toLowerCase();
		
//		// Approach 1
//		for(Character ch : str1.toCharArray() ) {
//			if (str1.indexOf(ch) == str1.lastIndexOf(ch)) {
//				System.out.println("the non repeating character is :: " + ch);
//				break;
//			}
//		}
		
		
		//Approach 2
		if(str1.length() == 0) {
			System.out.println("String invalid");
		} else {
			Map<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();
			
			for(int i=0; i< str1.length(); i++) {
				if(hMap.containsKey(str1.charAt(i))) {
					hMap.put(str1.charAt(i), hMap.get(str1.charAt(i)) +1);
				} else {
					hMap.put(str1.charAt(i), 1);
				}
			}
			
			for(Map.Entry<Character, Integer> mapvalues: hMap.entrySet()) {
				if (mapvalues.getValue() == 1 ) {
					System.out.println(mapvalues.getKey());
					break;
				}
			}
		}
		
		
	}
}
