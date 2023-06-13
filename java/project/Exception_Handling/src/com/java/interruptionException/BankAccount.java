package com.java.interruptionException;

class BankAccount {
	private double bal;

	public void setbal(double bal) {
		if (bal > 0) {
			this.bal = bal;

		} else {
			IllegalArgumentException ie = new IllegalArgumentException();
			throw ie;
			// throw new illegalArgumentException("invalid exception");
		}
	}

	public double getbal() {
		return this.bal;
	}
}
