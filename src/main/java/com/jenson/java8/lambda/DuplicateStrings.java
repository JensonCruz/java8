package com.jenson.java8.lambda;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStrings {
    public static void main(String[] args) {
        // List of strings
        List<String> strings = Arrays.asList("apple", "banana", "orange", "apple", "banana", "grape");

      List<String> duplicates = strings.stream()
    		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    		  .entrySet().stream()
    		  .filter(entry -> entry.getValue()>1)
    		  .map(Map.Entry::getKey)
    		  .collect(Collectors.toList());

        // Print the duplicates
        System.out.println("Duplicate strings: " + duplicates);
    }
}
