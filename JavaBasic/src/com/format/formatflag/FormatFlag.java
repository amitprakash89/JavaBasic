package com.format.formatflag;

public class FormatFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = String.format("%d", 32);
		String s2 = String.format("%o", 32);
		String s3 = String.format("%x", 32);
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*///format flag is #
		String s4 = String.format("%#o", 32);
		String s5 = String.format("%#x", 32);
		
		/*System.out.println(s4);
		System.out.println(s5);
		*/
		/*
		 * # - include radix
		 * 0 - zero padding
		 * - - Left justify
		 * , -include grouping separator
		 * space - leave space for positive numbers
		 * + - Always show sign
		 * ( -enclose negative value in paranthesis 
		 */
		
		/*
		 * below example of zero padding
		 * space is filled with 0 for 4 places
		 */
		String s6 = String.format("W:%04d X:%04d", 5,235);
		System.out.println(s6);
		String s7 = String.format("W:%04d X:%04d", 481,12);
		System.out.println(s7);
		
		/*
		 * Below example of left justify
		 * space is kept vacant for 4 places
		 */
		String s8 = String.format("W:%-4d X:%-4d", 5,235);
		System.out.println(s8);
		String s9 = String.format("W:%-4d X:%-4d", 481,12);
		System.out.println(s9);
		
		/*
		 * below example for , group separator
		 * int range = -2^31 to (2^31-1)
		 * (2^31-1) = 2147483647
		 */
		String s10 = String.format("%,d", 2147483647);
		System.out.println(s10);
		String s11 = String.format("%,.2f",348234323445433583.0);
		System.out.println(s11);
		
		/*
		 * below examples of format flags for 
		 * 1) space
		 * 2) +
		 * 3) (
		 */
		s1 = String.format("%d", 123);
		s2 = String.format("%d", -456);
		
		s3 = String.format("% d", 123);
		s4 = String.format("% d", -456);
		
		s5 = String.format("%+d", 123);
		s6 = String.format("%+d", -456);
		
		s7 = String.format("%(d", 123);
		s8 = String.format("%(d", -456);
		s9 = String.format("% (d", 123);
		
	}

}
