package com.isi.java.atim;



public class Account  {

	private static double acc_bal=0;

	public static double getBalance() {

		return acc_bal;
	}
	public static void deposit(double depositAmount) {
		if(depositAmount>=0) {
			acc_bal=acc_bal+depositAmount;
			AtmWindow.sucessMessage("Deposit");
			}
		else 
			AtmWindow.insufficientFunds();

	}
	public static void withdraw(double withdrawAmount) {
		if(withdrawAmount<=acc_bal && withdrawAmount>0) {
			acc_bal=acc_bal-withdrawAmount;
			AtmWindow.sucessMessage("Withdrawal");
		}
		else {
			AtmWindow.insufficientFunds();
		}

	}

}
