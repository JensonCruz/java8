package com.jenson.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jensoncruz
 * 
 *         Problem: Find and Concatenate Names Write a Java program to perform
 *         the following tasks:
 * 
 *         Given a list of names, filter out names that start with the letter
 *         'A' (case-insensitive). Convert the remaining names to lowercase.
 *         Concatenate these names into a single string, separated by commas.
 *         Print the resulting string.
 *
 * 
 */
public class ConcatenateNames {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Charles", "Andrew", "Eve");
		
		String results = names.stream()
				.filter(n -> !n.toLowerCase().startsWith("a"))
				.map(String :: toLowerCase)
				.collect(Collectors.joining(","));
		
		System.out.println(results);

	}
}
