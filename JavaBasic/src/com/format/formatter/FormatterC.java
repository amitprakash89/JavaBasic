package com.format.formatter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

public class FormatterC {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		doWrite(2,3,4,5,6);
	}

	
	static void doWrite(int david, int dawson, int dillon,
			int gordon, double avgDiff) throws IOException {
			BufferedWriter writer =
			Files.newBufferedWriter(Paths.get("myFile.txt"));
			try(Formatter f = new Formatter(writer)) {
			f.format("My nephews are %d, %d, %d, and %d years old",
			david, dawson, dillon, gordon);
			f.format("The average age between each is %.1f years",
			avgDiff);
			
			}
			}
}
