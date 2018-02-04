package com.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main4 {

	static Logger logger = Logger.getLogger(Main4.class.getName());
	
	
		public static void main (String[] args) throws SecurityException, IOException {
			FileHandler h = new FileHandler("%h/myapp_%g.log", 1000, 4);
			h.setFormatter(new SimpleFormatter());
			logger.addHandler(h);
			// Do something
			}
	
}
