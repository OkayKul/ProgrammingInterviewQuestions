package com.omkarkulkarni;

//Count number of occurences of a specific character
public class CountNumberOfCharsJava8 {
	public static void main(String[] args) {
		String str = "India is a Country";

		Integer totalCharacters = (int) str.chars().filter(x -> x =='a').count();
		System.out.println(totalCharacters);
	}
}
