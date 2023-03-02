package com.execeptionalhandling;

public class Insufficientfundexception extends RuntimeException{
	
	private String massage;
	public Insufficientfundexception(String massage) {
		super(massage);
	}
}
