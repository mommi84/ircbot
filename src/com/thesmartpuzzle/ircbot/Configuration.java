package com.thesmartpuzzle.ircbot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Tommaso Soru <mommi84 at gmail dot com>
 *
 */
public class Configuration {
	
	private String nick;
	private String nick1;
	private String nick2;
	private String ident;
	private String channel;
	private String bible;
	private String name;
	
	public Configuration(String file) {
		Scanner in = null;
		try {
			in = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.err.println("Configuration file '"+file+"' not found. Using 'Example.conf' instead...");
			try {
				in = new Scanner(new File("Example.conf"));
			} catch (FileNotFoundException e1) {
				System.err.println("Missing configuration file. Aborting.");
				System.exit(0);
			}
		}
		
		while(in.hasNextLine()) {
			String[] line = in.nextLine().split("=");
			if(line.length == 2) {
				line[1] = line[1].trim();
				switch(line[0].trim()) {
				case "nick":
					nick = line[1];
					break;
				case "nick1":
					nick1 = line[1];
					break;
				case "nick2":
					nick2 = line[1];
					break;
				case "ident":
					ident = line[1];
					break;
				case "channel":
					channel = line[1];
					break;
				case "bible":
					bible = line[1];
					break;
				case "name":
					name = line[1];
					break;
				}
			}	
		}
	}

	public String getNick() {
		return nick;
	}

	public String getNick1() {
		return nick1;
	}

	public String getNick2() {
		return nick2;
	}

	public String getIdent() {
		return ident;
	}

	public String getChannel() {
		return channel;
	}

	public String getBible() {
		return bible;
	}

	public String getName() {
		return name;
	}
}
