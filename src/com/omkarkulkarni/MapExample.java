package com.omkarkulkarni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(14,25,8,78,96,20,25,86,35,45);
		
		List<Integer> resultList = intList
				.stream().map(x-> x+2)
				.collect(Collectors.toList());
		
		System.out.println("Map example::" + resultList);
		
		intList.stream().flatMap(num-> Stream.of(num)).forEach(System.out::println);
	}
}
