package com.omkarkulkarni;

import java.util.Stack;

public class FindBalancedParantheses {
	public static void main(String[] args) {
		String str = "({)";
		
		boolean isBalancedString = isBalanced(str);
		System.out.println(isBalancedString);
	}

	private static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();
	   for(int i=0; i<str.length(); i++ )	{
		   char c = str.charAt(i);
		   if (c == '{' || c =='[' || c == '(') {
			   stack.push(c);
		   } else if( c==']' ) {
			   if (stack.isEmpty() || stack.pop() != '[') {
				   return false;
			   }
		   } else if( c=='}' ) {
			   if (stack.isEmpty() || stack.pop() != '{') {
				   return false;
			   }
		   } else if( c==')' ) {
			   if (stack.isEmpty() || stack.pop() != '(') {
				   return false;
			   }
		   }
		   
	   }
	   return stack.isEmpty();
		
	}
}
