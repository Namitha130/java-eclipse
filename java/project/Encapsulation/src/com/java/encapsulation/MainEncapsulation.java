package com.java.encapsulation;

public class MainEncapsulation
{ 	
	public static void main(String[] args) 
	{
		Account a1 = new Account();
		Transaction.checkbal(a1);
		Transaction.deposit(1000,a1);
		Transaction.checkbal(a1);
		Transaction.withdraw(500,a1);
		Transaction.checkbal(a1);
		Transaction.withdraw(500,a1);
		
	}
	
}
