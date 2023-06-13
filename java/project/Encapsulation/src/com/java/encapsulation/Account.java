package com.java.encapsulation;
//BEAN CLASS or POJO CLASS or ENCAPSULATED CLASS
public class Account {
	private double bal;
	public void setBal(double bal)
	{  
		if(bal > 0) {
			this.bal = bal;
		}
		else
		{
			System.out.println("Insuffient balance");
			IllegalArgumentException ie = new IllegalArgumentException();
			throw ie;
			//throw new illegalArgumentException("invalid exception");
		}
	}
	public double getBal() {
		return this.bal;
	}
}
