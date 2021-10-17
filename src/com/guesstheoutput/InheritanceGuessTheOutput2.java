package com.guesstheoutput;




class A {
	public void print() {
		System.out.println("A");
	}
}


class B extends A {
	public void print() {
		System.out.println("B");
	}
}

class C extends B {
	public void print() {
		super.print();
		System.out.println("C");
	}
}

public class InheritanceGuessTheOutput2 {
	public static void main(String[] args) {
		C c = new C();
		c.print();
	}
	
}