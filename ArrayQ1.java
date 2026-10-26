package com.shashank.array;

public class ArrayQ1 {

	public static void main(String[] args) {
		int a[]=null;
		Object o=a;
		//Object[] oo= a;//error
		Object[] oo= {a,null,"jhghj"};
		Character c=Character.valueOf('k'); //char to Character
		Integer i1=Integer.valueOf(2); //int to Integer
		Integer i2=Integer.valueOf("2"); //String to Integer
		String s=String.valueOf(2); //int to String
		int i3=Integer.parseInt("2"); //String to int
		Integer i4=Integer.decode("2");  //String to Integer

//		int i33=Integer.parseInt("0x2a3"); //NumberFormatException
		Integer i44=Integer.decode("0x2a3"); //String to Integer
		System.out.println(i44);
	}

}