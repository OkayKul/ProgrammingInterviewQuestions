package com.guesstheoutput;

public class InheritanceGuessTheoutput {
	public static void main(String[] args) {
		Child child = new Child();
	}
}

class Parent {
	static {
		System.out.println("Parent Static Block");
	}
	{
		System.out.println("Parent Initialization Block");
	}
	
	Parent() {
		System.out.println("Parent constr");
	}
}

class Child extends Parent {
	static {
		System.out.println("Child Static Block");
	}
	{
		System.out.println("Child Initialization Block");
	}
	
	Child() {
		System.out.println("Child constr");
	}
}
