package com.jenson.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
public class Java8Problems {

	public static void main(String[] args) {

		/** Java program to count the occurrence of each characters in a String */
		String name = "littlehearts";
		Map<String, Long> result = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);

		/** Java program to find all duplicate elements in a String */

		List<String> duplicateElements = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(s -> s.getValue()> 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println("duplicate elements: " + duplicateElements);

		/** Java program to find all unique elements in a String */

		List<String> uniqueElements = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(t -> t.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println("unique elements: " + uniqueElements);

		/** Java program to find all first non repeated elements in a String */
		String firstNonRepeat = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(t -> t.getValue() == 1)
				.map(Map.Entry::getKey).findFirst()
				.orElse("No such element found");

		System.out.println("first non repate elements: " + firstNonRepeat);

		/** Find second highest number in an array **/

		int[] numbers = { 1, 2, 45, 34, 67, 23, 11 };

		Integer secondHighestNumber = Arrays.stream(numbers)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(0);

		System.out.println("second highest elements: " + secondHighestNumber);

		/** find longest string in an array */

		String[] strArray = { "java", "python", "openshift", "aws", "apigee" };
		String longestString = Arrays.stream(strArray)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.orElse("No such element found");

		System.out.println("Longest String: " + longestString);

		/** Find all integers starts with 1 */

		List<String> strList = Arrays.stream(numbers).boxed().map(t -> t + "").filter(t -> t.startsWith("1"))
				.collect(Collectors.toList());

		System.out.println("Element starts with 1: " + strList);
		
		
		/** String.join */

		List<String> values = Arrays.asList("1", "2", "3", "4");
		String delimeterString = String.join("-", values);
		System.out.println("Adding delimeter: "+ delimeterString);
	}
}
