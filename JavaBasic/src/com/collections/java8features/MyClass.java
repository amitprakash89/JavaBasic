package com.collections.java8features;

public class MyClass {

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

	public MyClass(String label, String value)
	{
		this.label = label;
		this.value = value;
	}
	
	public boolean equals(Object o)
	{
		MyClass other = (MyClass)o;
		return value.equalsIgnoreCase(other.value);
	}
}
