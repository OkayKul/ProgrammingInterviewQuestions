package com.guesstheoutput;

public class ArrayGuessTheOutput {
	public static void main(String[] args) {
		int a[] = {3,10,23,0};
		int b[] = new int[5];
		System.out.println(a.length);
		
		// Answer : The output here is 3
		// Explaination : The last entry after the comma after the 6 is empty.
		//That is not considered as an Integer. Hence the length returns 3		
	}
}
