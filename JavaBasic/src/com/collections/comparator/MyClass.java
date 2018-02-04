package com.collections.comparator;

public class MyClass implements Comparable<MyClass>{

	String label, value;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MyClass(String label,String value)
	{
		this.label = label;
		this.value = value;
	}
	
	public String toString()
	{
		return label +" | "+ value;
	}
	
	public boolean equals(Object o)
	{
		MyClass other = (MyClass) o;
		return value.equalsIgnoreCase(other.value);
	}

	@Override
	public int compareTo(MyClass other) {
		// TODO Auto-generated method stub
		return value.compareToIgnoreCase(other.value);
	}
}
