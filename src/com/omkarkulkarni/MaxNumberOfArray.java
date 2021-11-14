package com.omkarkulkarni;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumberOfArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(15,85,7,4,14);
		Optional<Integer> maxNumber =  list.stream().max((i,j) -> i.compareTo(j));
		System.out.println(maxNumber.get());
	}

}
