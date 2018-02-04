package com.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main5 {

	static Logger logger = Logger.getLogger(Main5.class.getName());
	public static void main (String[] args) {
	logger.log(Level.INFO ,"We’re Logging!");
}
}
