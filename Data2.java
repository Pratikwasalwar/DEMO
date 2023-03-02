package com.execeptionalhandling;

public class Data2 {

	public static void main(String[] args) {
		
		System.out.println("hi");
		System.out.println("hello");
		
		//1) A scenario where ArithmeticException occurs.
		/*try{
			int a = 10/0;
		}catch(Exception e) {
			System.out.println(e);
		}*/
		
		//2) A scenario where NullPointerException occurs
		
		try {
			String s = null;
		} catch(NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("how are you");
		System.out.println("i am fine ");
	}
}
