package com.jenson.java8.lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyString {
    public static void main(String[] args) {
        // List of strings
        List<String> strings = Arrays.asList("apple", "banana", "orange", "apple", "banana", "grape");

        Map<String, Long> frequency = strings.stream()
        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        frequency.forEach((key, value) -> System.out.println(key + ":" + value));
        
        
        //duplicateString
        
        List<String> duplicate = strings.stream()
        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        		.entrySet().stream()
        		.filter(t->t.getValue()>1)
        		.map(Map.Entry::getKey)
        		.collect(Collectors.toList());
        
        System.out.println("-----------------------------------------");        
        System.out.println("Duplicate string: "+duplicate);
        
        //unique String
        List<String> unique = strings.stream()
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        		.entrySet().stream()
        		.filter(t->t.getValue()==1)
        		.map(Map.Entry::getKey)
        		.collect(Collectors.toList());
        
        System.out.println("Unique String: "+unique);
        
        System.out.println("-----------------------------------------");        
        
        //Find longest String
        String longestString = strings.stream()
        		.max(Comparator.comparing(String::length))
        		.orElse("no string present");
        
        System.out.println("longest String: "+longestString);
        
        System.out.println("-----------------------------------------");        
        
        //Sort String by length
        Set<String> sortByLength = strings.stream()
        		.sorted(Comparator.comparing(String::length))
        		.collect(Collectors.toCollection(LinkedHashSet::new));
        
        System.out.println("Sort by length: "+sortByLength);
        
        System.out.println("-----------------------------------------");
        
        //Reverse Strings  
        List<String> reverse = strings.stream()
        		.map(t-> new StringBuilder(t).reverse().toString())
        		.collect(Collectors.toList());
        System.out.println("reverse: "+ reverse);
        
        System.out.println("-----------------------------------------");
        
        //Concatenate Strings with a Separator
        String concat = strings.stream()
        		.collect(Collectors.joining(","));
        System.out.println("Concate: "+concat);
        
        System.out.println("-----------------------------------------");
        
        //Group Strings by First Character
        Map<Object, List<String>> group = strings.stream()
        .collect(Collectors.groupingBy(t -> t.charAt(0)));
        
        System.out.println("group: "+group);
        
    }
}
