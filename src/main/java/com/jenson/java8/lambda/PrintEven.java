package com.jenson.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jensoncruz 
 * 
 * Problem: Find and Print Even Numbers Write a Java program
 *         to perform the following tasks:
 * 
 *         Given a list of integers, filter out all the even numbers. Multiply
 *         each even number by 2. Sort the resulting numbers in descending
 *         order. Collect the results into a new list and print it.
 * 
 *
 * 
 */
public class PrintEven {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 8, 3, 12, 7, 10, 2, 1);
		
		List<Integer> results = numbers.stream()
				.filter(n -> n%2==0)
				.map(n -> n*2)
				.sorted((a,b) -> b-a)
				.collect(Collectors.toList());
		
		System.out.println(results);

	}
}
