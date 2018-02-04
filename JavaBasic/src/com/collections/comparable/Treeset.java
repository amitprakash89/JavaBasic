package com.collections.comparable;

import java.util.TreeSet;

public class Treeset {
	
	public static void main(String[] args) {
		
		TreeSet<MyClass> tree = new TreeSet();
		
		MyClass v1 = new MyClass("2222","ghi");
		MyClass v2 = new MyClass("3333","abc");
		MyClass v3 = new MyClass("1111","def");
		
		tree.add(v1);
		tree.add(v2);
		tree.add(v3);
		
		tree.forEach(x -> System.out.println(x));
		
		/*
		 * It will print below output
		 *  3333 | abc
			1111 | def
			2222 | ghi
			TREESET WILL USE THE SORT BEHAVIOUR PROVIDED BY THE COMPARABLE INTERFACE.

		 * 
		 */
	}
}
