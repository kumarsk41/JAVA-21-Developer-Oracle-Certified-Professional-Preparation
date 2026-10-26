package com.shashank.array;

import java.util.LinkedList;
import java.util.List;

public class LinkedListQ1 {
static void m1(List<String> l1) {
	System.out.println(l1.add("sjkjo"));
}
	public static void main(String[] args) {
		var a=new LinkedList<Integer>();
		
//		var aa=new LinkedList<>();//allowed
		
		a.add(10); //add at last
		a.add(8); //add at last
		a.offer(18); //add at last
		a.offer(12); //add at last
		a.addFirst(5); //add at beginning
		a.addLast(6); //add at last
		a.push(7); //add at beginning
		System.out.println(a);
		System.out.println(a.poll());//remove from beginning
		System.out.println(a.poll());//remove from beginning
		System.out.println(a.pop());//remove from beginning

		
	List l1=	List.of("shashank","ram","kumar");
		
		m1(l1);
		
	}

}