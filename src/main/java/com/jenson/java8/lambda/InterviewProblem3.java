package com.jenson.java8.lambda;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProblem3 {

	public static void main(String args[]) {

		String str = "Jenson Cruz Trivandrum India";

		Map<Character, Long> values = str.toLowerCase().chars()
//				.filter(Character::isLetter) 
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		values.forEach((key,value)->System.out.println(key +":"+ value));

//		int i = 10;

		int[] a = { 0, 1, 2, 3, 5, 4, 0, 1, 2, 3, 0, 6, 7, 1, 2, 3, 99, 10, 0, 1 };

		int[] temp = new int[a.length];

		int index = 0;

//		Arrays.sort(a);

		int[] sortedArray = sortArray(a);

		temp[index++] = sortedArray[0];
		for (int j = 1; j < sortedArray.length; j++) {
			if (sortedArray[j] != sortedArray[j - 1]) {
				temp[index++] = sortedArray[j];
			}
		}

		System.out.println("index: " + index);
		

		int[] result = Arrays.copyOf(temp, index);
		

		for(int i=0;i<index;i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("lenght:"+result.length);

	}

	private static int[] sortArray(int[] a) {

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					// Swap elements
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
//		for (int i = 0; i < n; i++) {
//			System.out.println("Sorted Array: " + a[i]);
//		}
		return a;
	}

}
