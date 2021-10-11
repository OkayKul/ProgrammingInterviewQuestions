package com.omkarkulkarni;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortArrayWithPredefinedFunctions {
	public static void main(String[] args) {
		int[] numArray = {52,87,99,15,2,4,0,8,63,97,58,15};
		System.out.println("The unsorted array is::");
		printArray(numArray);
		
		// Ascending Order Sort
		Arrays.sort(numArray);
		System.out.println("The sorted array in ascending order is::");
		
		printArray(numArray);
		// Descending Order Sort
		 int[] descendingOrderArray = IntStream.of(numArray)
	                .boxed()
	                .sorted(Comparator.reverseOrder())
	                .mapToInt(i -> i)
	                .toArray();
		
		System.out.println("The sorted array in descending order is::");
		printArray(descendingOrderArray);
	}
	
	private static void printArray(int[] numArray) {
		for(int num: numArray) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}


