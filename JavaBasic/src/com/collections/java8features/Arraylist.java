package com.collections.java8features;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MyClass> list = new ArrayList<>();
		
		MyClass v1 = new MyClass("v1","abc");
		MyClass v2 = new MyClass("v2","abc");
		MyClass v3 = new MyClass("v3","abc");
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		
		list.remove(v2);
		
		list.forEach( x -> System.out.println(x.getLabel()));
		
	}

}
