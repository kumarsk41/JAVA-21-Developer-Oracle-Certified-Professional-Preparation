package com.shashank.array;

import java.util.Arrays;

public class ArrayQ2 {

	public static void main(String[] args) {
		var l = new String[] { "Linux", "Mac", "Windows" };
		var m = new String[] { "Mac", "Linux", "Windows" };
		var search = Arrays.binarySearch(l, "Linux"); //0
		
//		Arrays.mismatch(Object[] a, Object[] b);
/*		Finds and returns the index of the first mismatch between two Object arrays, 
		otherwise return -1 if no mismatch is found. */
		var mismatch1 = Arrays.mismatch(l, m); //0
		var mismatch2 = Arrays.mismatch(m, m); //-1
		
		System.out.println(search + " " + mismatch1 + " " + mismatch2);
	}

}