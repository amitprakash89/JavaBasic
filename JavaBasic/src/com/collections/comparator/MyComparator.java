package com.collections.comparator;

import java.util.Comparator;

/*
 * This class is responsible for providing sorting behaviour for MyClass
 */
public class MyComparator implements Comparator<MyClass>{
	
	

	@Override
	public int compare(MyClass x, MyClass y) {
		// TODO Auto-generated method stub
		return x.getLabel().compareToIgnoreCase(y.getLabel());
	}

}
