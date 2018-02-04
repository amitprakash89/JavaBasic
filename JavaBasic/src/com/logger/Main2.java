package com.logger;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main2 {


		// TODO Auto-generated method stub

		static Logger logger =
				LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
				public static void main (String[] args) {
				logger.setLevel(Level.INFO);
				logger.log(Level.SEVERE, "Uh Oh!!");
				logger.log(Level.INFO, "Just so you know");
				logger.log(Level.FINE, "Hey developer dude");
				logger.log(Level.FINEST, "You’re special");
				}
	}


