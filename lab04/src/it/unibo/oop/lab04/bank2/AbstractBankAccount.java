package it.unibo.oop.lab04.bank2;

import it.unibo.oop.lab04.bank.SimpleBankAccount;

public abstract class AbstractBankAccount implements it.unibo.oop.lab04.bank.BankAccount {
    
	public static final double ATM_TRANSACTION_FEE = 1;
    public static final double MANAGEMENT_FEE = 5;
	
	private final int usrID;
    private double balance;
    private int nTransactions;
	
	public AbstractBankAccount(int usrID, double balance) {
		this.usrID = usrID;
		this.balance = balance;
		this.nTransactions = 0;
	}
	
	
	
	public void computeManagementFees(int usrID) {
		this.balance -= MANAGEMENT_FEE;
	}

    public void deposit(int usrID, double amount) {
    	this.balance += amount;
    	this.incNTransactions();
    }

    public void depositFromATM(int usrID, double amount) {
    	this.balance += amount - ( getNTransactions() * ATM_TRANSACTION_FEE );
    	this.incNTransactions();
    }

    public  double getBalance() {
    	return this.balance;
    }

    public  int getNTransactions() {
    	return this.nTransactions;
    }
    
    public  void incNTransactions() {
    	this.nTransactions++;
    }


    public  void withdraw(int usrID, double amount) {
    	this.balance -= amount;
    	this.incNTransactions();
    }

    public  void withdrawFromATM(int usrID, double amount) {
    	this.balance -= amount + getNTransactions() * ATM_TRANSACTION_FEE ;
    	this.incNTransactions();
    }
    
    protected abstract boolean isWithDrawAllowed(double amount);
    
    protected abstract double computeFees();
    
}
