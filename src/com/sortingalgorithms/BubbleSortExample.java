package com.sortingalgorithms;

public class BubbleSortExample {
	public static void main(String[] args) {
		BubbleSortExample bubbleSortExample = new BubbleSortExample();
		int arr[] = {25,85,69,74,1,8,9,35,25,87,92};
		bubbleSortExample.bubblesort(arr);
		System.out.println("The sorted array is ::");
		bubbleSortExample.printArray(arr);
	}

	private void printArray(int[] arr) {
		int arrayLength = arr.length;
		for(int i=0; i< arrayLength; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		
	}

	private void bubblesort(int[] arr) {
		int arrayLength = arr.length;
		for(int i=0; i< arrayLength -1; i++) {
			for(int j=0; j<arrayLength-i-1;j++) {
				if (arr[j] > arr[j+1])
                {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
                }
			}
		}
	}
}
