package com.jenson.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author jensoncruz
 * 
 *         Problem: Find the Longest Word Write a Java program to perform the
 *         following tasks:
 * 
 *         Given a list of strings, find the longest word. If there are multiple
 *         words with the same length, return the first one in the list. Print
 *         the longest word.
 *
 * 
 */
public class LongestWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

		// Find the longest word using Stream
		String longestWord = words.stream().reduce((word1, word2) -> word1.length() >= word2.length() ? word1 : word2)
				.orElse(""); // Handle case where the list is empty

		// Print the result
		System.out.println("Longest Word: " + longestWord);
		
		
		// Find the longest word using max
        String longestMaxWord = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(""); // Handle case where the list is empty
        
        
		/*
		 * Step 1: max with Comparator java Copy code
		 * .max(Comparator.comparingInt(String::length))
		 * Comparator.comparingInt(String::length):
		 * 
		 * This creates a comparator that compares the length of two strings. For
		 * example, "apple".length() (5) will be compared with "banana".length() (6).
		 * How max Works:
		 * 
		 * It iterates through all elements of the stream. It keeps the element that is
		 * "greater" according to the comparator. For example: Compare "apple" with
		 * "banana" → Keep "banana" (longer length). Compare "banana" with "cherry" →
		 * Keep "banana" (same length, first occurrence wins). Continue until the
		 * longest word is found.
		 */

        // Print the result
        System.out.println("Longest Word: " + longestMaxWord);

	}
}
