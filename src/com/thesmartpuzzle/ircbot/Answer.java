package com.thesmartpuzzle.ircbot;

/**
 * @author Tommaso Soru <mommi84 at gmail dot com>
 *
 */
public class Answer {

	private String message;
//	private double weight;

	public Answer(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean equals(Object a) {
		return message.equals(((Answer) a).getMessage());
	}
	
}
