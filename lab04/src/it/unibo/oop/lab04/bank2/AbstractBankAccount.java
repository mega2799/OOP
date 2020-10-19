package it.unibo.oop.lab04.bank2;

import it.unibo.oop.lab04.bank.SimpleBankAccount;

public abstract class AbstractBankAccount implements it.unibo.oop.lab04.bank.BankAccount {
    
	private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;
	
	private final int usrID;
    private double balance;
    private int nTransactions;
	
	public AbstractBankAccount(int usrID, double balance, int nTransactions) {
		this.usrID = usrID;
		this.balance = balance;
		this.nTransactions = nTransactions;
	}

	public void computeManagementFees(int usrID) {
		this.balance -= MANAGEMENT_FEE;
	}

    public void deposit(int usrID, double amount) {
    	this.balance += amount;
    }

    public void depositFromATM(int usrID, double amount) {
    	this.balance += amount - ( getNTransactions() * ATM_TRANSACTION_FEE );

    }

    public  double getBalance() {
    	return this.balance;
    }

    public  int getNTransactions() {
    	return this.nTransactions;
    }

    public  void withdraw(int usrID, double amount) {
    	this.balance -= amount;
    }

    public  void withdrawFromATM(int usrID, double amount) {
    	this.balance -= amount + getNTransactions() * ATM_TRANSACTION_FEE ;
    }
    
    protected boolean isWithDrawAllowed(double amount) {
    	return balance > amount;
    }
    
    protected double computeFee() {
    	return MANAGEMENT_FEE;
    }
}
