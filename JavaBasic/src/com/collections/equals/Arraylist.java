package com.collections.equals;

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
		
		//list.forEach( x -> System.out.println(x.getLabel()));
		
		ArrayList<MyClassDao> list1 = new ArrayList<MyClassDao>();
		
		MyClassDao v4 = new MyClassDao("v4","abc");
		MyClassDao v5 = new MyClassDao("v5","abc");
		MyClassDao v6 = new MyClassDao("v6","abc");
		
		list1.add(v4);
		list1.add(v4);
		list1.add(v4);
		
		list1.remove(v4);
		
		list1.forEach(x -> System.out.println(v4.getLabel()));
	}

}
