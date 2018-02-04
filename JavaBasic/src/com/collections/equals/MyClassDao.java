package com.collections.equals;

public class MyClassDao {

	private String label,value;

	public MyClassDao(String label, String value)
	{
		this.label = label;
		this.value = value;
	}
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
	
	public boolean equals(Object o)
	{
		MyClassDao other = (MyClassDao) o;
		return value.equalsIgnoreCase(other.value);
	}
	
}
