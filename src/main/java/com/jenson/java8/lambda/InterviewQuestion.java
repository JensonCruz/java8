package com.jenson.java8.lambda;

public class InterviewQuestion {

	public static void main(String args[]) {
		String s = "H e l l o"; // hello
        String newString = "";
        
        char[] c = s.toCharArray();
        
        for(char val: c) {
        	if(!Character.isWhitespace(val))
        		newString = newString+val;
        }
        System.out.println("after removed whitespace: "+newString);

		String str = "madam";

		boolean isPalindrome = true;

		// Check characters from both ends
		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}

		if (isPalindrome) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}

	}
}