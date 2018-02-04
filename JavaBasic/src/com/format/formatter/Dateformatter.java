package com.format.formatter;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class Dateformatter {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ref URL
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
		 */
		 Calendar c = new GregorianCalendar(1995, 0, 23);
		 Calendar c2 = new GregorianCalendar(1989, 11, 8);
		   String s = String.format("Duke's Birthday: %1$tb %1$te, %1$tY", c);
		   // -> s == "Duke's Birthday: May 23, 1995"
		   System.out.println(s);
		    s = String.format("Duke's Birthday: %1$tb %1$te, %1$tY, %1$ta, %1$tB."
		    		+ " Amit Birthday is %2$tb,%2$te,%2$tY,%2$ta", c,c2);
			   System.out.println(s);

		   Formatter f = new Formatter();
		   f.format("Last reboot at %tc", c);
		    s = f.toString();
		    System.out.println(s);
		    
		    
	}

}
