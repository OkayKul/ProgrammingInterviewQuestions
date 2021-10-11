package com.omkarkulkarni;

public class SortArrayWithoutPredefinedFunctions {
	// Do not use Arrays.sort() for the sorting
	
	public static void main(String[] args) {
		int[] numArray = {52,87,99,15,2,4,0,8,63,97,58,15};
		
		for(int i=0; i< numArray.length; i++) {
			for (int j = i+1; j< numArray.length; j++) {
				int temp = 0;
				
				if(numArray[i] > numArray[j]) { // If sorting is to be done in descending order change sign
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		
		
		printArray(numArray);
	}

	private static void printArray(int[] numArray) {
		for(int num: numArray) {
			System.out.print(num + " ");
		}
	}
}
