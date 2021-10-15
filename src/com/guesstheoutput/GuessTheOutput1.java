package com.guesstheoutput;

public class GuessTheOutput1 {
	void display(Object obj) {
		System.out.println("Object");
	} 
	
	void display(String str1) {
		System.out.println("String");
	}
	
	
	public static void main(String[] args) {
		GuessTheOutput1 object1 = new GuessTheOutput1();
		
		object1.display(null);
	}
	
	// Answer :: String
	// Explaination : The compiler tries to match the near exact parameter while calling the method.
	// Here the null that we have sent to the display gets considered as the null string 
	// Hence the method with the string parameter is invoked.
}
