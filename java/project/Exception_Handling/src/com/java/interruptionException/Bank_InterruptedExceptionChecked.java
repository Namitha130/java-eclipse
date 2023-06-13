package com.java.interruptionException;

public class Bank_InterruptedExceptionChecked {
	
		public static void main(String[] args) 
		{
			Bank_Transaction a1 = new Bank_Transaction();
			Bank_Transaction.checkbal(a1);
			Bank_Transaction.deposit(1000,a1);
			Bank_Transaction.checkbal(a1);
			Bank_Transaction.withdraw(500,a1);
			Bank_Transaction.checkbal(a1);
			Bank_Transaction.withdraw(500,a1);
			
		}
	
}
