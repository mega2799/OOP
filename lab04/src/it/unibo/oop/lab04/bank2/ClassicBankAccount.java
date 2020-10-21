package it.unibo.oop.lab04.bank2;

public class ClassicBankAccount extends AbstractBankAccount {

	public ClassicBankAccount(int usrID, double balance) {
		super(usrID, balance);
	}

	protected boolean isWithDrawAllowed(double amount) {
		return amount <= getBalance();
	}

	protected double computeFees() {
		return MANAGEMENT_FEE;
	}
	
}
