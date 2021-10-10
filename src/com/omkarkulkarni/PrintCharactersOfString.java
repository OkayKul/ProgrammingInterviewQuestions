package com.omkarkulkarni;

public class PrintCharactersOfString {
	public static void main(String[] args) {
		String str = "java";
		str.chars().forEach((ch) -> System.out.println(ch));
	}
}
