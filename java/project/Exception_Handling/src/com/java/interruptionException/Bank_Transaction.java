package com.java.interruptionException;

public class Bank_Transaction {
	public static void deposit(double amount, BankAccount ref)
	{
		double b1 = ref.getbal();
				b1= b1+amount;
				ref.setbal(b1);
	}
	public static void withdraw(double amount, BankAccount ref)
	{
		double b1 = ref.getbal();
				b1= b1 - amount;
				ref.setbal(b1);
	}
	public static void checkbal(BankAccount ref)
	{
		System.out.println("Check balance is :"+ ref.getbal());
	}
}
