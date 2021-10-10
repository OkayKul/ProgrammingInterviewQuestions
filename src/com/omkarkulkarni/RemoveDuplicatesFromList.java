package com.omkarkulkarni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Remove Duplicated from ArrayList
public class RemoveDuplicatesFromList {
	public static void main(String[] args) {
		// Approach 1 Using the Lambda Functions
		
		List<Integer> listNumbers = new ArrayList<Integer>(
				Arrays.asList(5,8,9,6,8,5,1,2,5,8,9,11,18,15,11)
				);
		System.out.println("The arrays in the first part is ::");
		
		printArray(listNumbers);
		System.out.println();
		List<Integer> resultantArray = listNumbers.stream()
				.distinct()
				.collect(Collectors.toList());
//		System.out.println("Arrays after removing duplicated through lambda functions:: ");
		
//		printArray(resultantArray);
		
		//Approach 2 //
		//Set interface does not allow duplicates 
		
		Set<Integer> setOfIntegers = new LinkedHashSet<Integer>();
		//Add all the numbers to the set
		setOfIntegers.addAll(listNumbers);
		// Clear the original list
		listNumbers.clear();
		// add numbers from set to original list
		listNumbers.addAll(setOfIntegers);
		
		//print the sorted array
		printArray(listNumbers);
	}

	private static void printArray(List<Integer> listNumbers) {
		for(int num: listNumbers) {
			System.out.print(num + " ");
		}
	}
}
