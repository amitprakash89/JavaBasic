package com.format.argumentindex;

import java.util.Formatter;
import java.util.Locale;

public class ArgumentIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = String.format("%d %d %d", 100, 200, 300);
		System.out.println(s1);
		
		String s2 = String.format("%3$d %2$d %1$d", 100, 200, 300);
		System.out.println(s2);
		
		//String s3 = String.format("%d %d %d", 100, 200, 300);
		//System.out.println(s3);
		
		   StringBuilder sb = new StringBuilder();
		   // Send all output to the Appendable object sb
		   Formatter formatter = new Formatter(sb, Locale.US);

		   // Explicit argument indices may be used to re-order output.
		   formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
		   
		   System.out.println(sb.toString());
	}

}
