package com.omkarkulkarni;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacters {
	public static void main(String[] args) {
		String str = "India is a Country";
		HashMap<Character, Integer> charactersMap = new HashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			if (charactersMap.containsKey(ch)) {
				charactersMap.put(ch, charactersMap.get(ch) +1);
			} else {
				charactersMap.put(ch, 1);
			}
		}
		
		 for (Map.Entry entry : charactersMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}	
}
