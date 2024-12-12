package com.jenson.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jensoncruz 
 * 		   Problem: Filter and Transform a List of Strings Write a
 *         Java program to perform the following tasks on a list of strings
 *         using lambda expressions and streams:
 * 
 *         Given a list of strings, filter out strings that are shorter than 4
 *         characters. Convert the remaining strings to uppercase. Collect the
 *         results into a new list and print it.
 *
 */
public class StringSort {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "bat", "cat", "dog", "elephant", "fox");
		List<String> upperWord = words.stream().filter(w -> w.length() > 4).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(upperWord);

	}
}
