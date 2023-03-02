package com.execeptionalhandling;
//custom exeception.
public class Account {
	//set the value as a consider as setter
	private int balance = 50000;
	
	//create getbalance method.
	public int getbalance() {
		return balance;
	}
	public void withdraw(int ammount) {
		if (ammount > balance) {
			//custom exeception create, own create exeception.
			throw new Insufficientfundexception("Insufficient fund in you account");
		}
		balance  = balance - ammount;
	}
}
