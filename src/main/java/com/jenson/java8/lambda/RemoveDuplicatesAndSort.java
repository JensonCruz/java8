package com.jenson.java8.lambda;

public class RemoveDuplicatesAndSort {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 5, 4, 0, 1, 2, 3, 0, 6, 7, 1, 2, 3, 99, 10, 0, 1 };

		// Find the range of the array
		int max = findMax(a);
		int min = findMin(a);

		// Create an auxiliary array for tracking presence of numbers
		boolean[] seen = new boolean[max - min + 1];

		// Create a result array to hold unique and sorted elements
		int[] result = new int[a.length];
		int index = 0;

		// Mark presence of numbers and construct result array
		for (int num : a) {
			if (!seen[num - min]) { // Check if the number is seen
				seen[num - min] = true;
				result[index++] = num; // Add unique number to the result
			}
		}

		// Print the unique sorted array
		System.out.println("Sorted Array without duplicates:");
		for (int i = 0; i < index; i++) {
			System.out.print(result[i] + " ");
		}
	}

	// Helper method to find maximum in the array
	private static int findMax(int[] a) {
		int max = a[0];
		for (int num : a) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	// Helper method to find minimum in the array
	private static int findMin(int[] a) {
		int min = a[0];
		for (int num : a) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
}
