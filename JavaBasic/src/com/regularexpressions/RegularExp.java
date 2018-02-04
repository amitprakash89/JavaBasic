package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//replaceAll
		String s1 = "apple, apple and orange please";
		String s2 = s1.replaceAll("ple", "ricot");
		String s3 = s1.replaceAll("ple\\b", "ricot");
		
		//split 
		String[] parts = s1.split("\\b");
		for(String thePart:parts)
			if(thePart.matches("\\w+"))
			System.out.println(thePart);
		
		//Pattern and matcher classes
		String value1 = "apple, apple and orange please";
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(value1);
		while(matcher.find())
		System.out.println(matcher.group());
		
		
	}

}
