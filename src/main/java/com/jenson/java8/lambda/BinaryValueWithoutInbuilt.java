package com.jenson.java8.lambda;

public class BinaryValueWithoutInbuilt {
	public static void main(String[] args) {
		int number = 10; // Example number
		System.out.println("Binary value of " + number + " is: " + toBinary(number));
	}

	public static String toBinary(int number) {
		StringBuilder binary = new StringBuilder();

		while (number > 0) {
			int remainder = number % 2; // Get the remainder (0 or 1)
			binary.append(remainder); // Append remainder to binary string
			number = number / 2; // Update the number by dividing it by 2
		}

		// Binary is calculated in reverse order, so reverse it
		return binary.reverse().toString();
	}
}
