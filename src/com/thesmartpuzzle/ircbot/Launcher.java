package com.thesmartpuzzle.ircbot;

/**
 * @author Tommaso Soru <mommi84 at gmail dot com>
 *
 */
public class Launcher {

	/**
	 * @param args The configuration file.
	 */
	public static void main(String[] args) {
		
		if(args.length == 1)
			new Bot(new Configuration(args[0]));
		else
			System.err.println("Please locate the configuration file.");
		
	}

}
