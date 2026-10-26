package com.shashank.array;

import java.util.Arrays;
import java.util.List;

public class ArrayQ3 {

	public static void main(String[] args) {
		String[] array = {"Natural History", "Science"};
		var m1 = Arrays.asList(array); //Returns a fixed-size list
		m1.set(0, "Art");
//		m1.add("Art"); //UnsupportedOperationException
		System.out.println(m1.contains("Art")); //true
		
		var m2 = Arrays.asList("Natural History, Science");
		m2.set(0, "Art");
		System.out.println(m2.contains("Art")); //true
		
		var m3 = List.of(array); //Returns an unmodifiable list 
		m3.set(0, "Art"); //UnsupportedOperationException
		System.out.println(m3.contains("Art")); 
		
		var m4 = List.of("Natural History", "Science");  //Returns an unmodifiable list 
		m4.set(0, "Art"); //UnsupportedOperationException
		System.out.println(m4.contains("Art")); 
		
	}

}