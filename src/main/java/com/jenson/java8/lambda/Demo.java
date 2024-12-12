package com.jenson.java8.lambda;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String args[]) {
		
		/**find common element in two arrays*/
		 int[] a = {2,1,1,3,5,6,7};
	     int[] b=   {0,3,9,3,5,6,8,8};
	     
	  Set<Integer> setA = Arrays.stream(a).boxed().collect(Collectors.toSet());
	  
	  Set<Integer> setB = Arrays.stream(b).boxed().collect(Collectors.toSet());
	  
	  setA.retainAll(setB);
	  
	  System.out.println("Common elements: "+ setA);
	    
	}

}
