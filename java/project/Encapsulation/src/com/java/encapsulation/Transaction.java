package com.java.encapsulation;
//SERVICE CLASS
public class Transaction 
{
	public static void deposit(double amount, Account ref)
	{
		double b1 = ref.getBal();
				b1= b1+amount;
				ref.setBal(b1);
	}
	public static void withdraw(double amount, Account ref)
	{
		double b1 = ref.getBal();
				b1= b1 - amount;
				ref.setBal(b1);
	}
	public static void checkbal(Account ref)
	{
		System.out.println("Check balance is :"+ ref.getBal());
	}
}
