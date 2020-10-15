package oop.lab03.bank.interfaces;

public class StrictBankAccount implements BankAccount{

	private int userID;
	private double balance;
    private int nTransactions;
    
	static double ATM_TRANSACTION_FEE = 1;
	static double MANAGEMENTS_FEE = 1;

	
	public StrictBankAccount(final int userID, final double balance, final int nTransactions){
		this.userID = userID;
		this.balance = balance;
		this.nTransactions = nTransactions;
	}
    
   public int getUserID() {
		return this.userID;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getnTransactions() {
		return this.nTransactions;
	}
    
    private boolean checkUser(final int id) {
        return this.userID == id;
    }
	
	
	
	@Override
	public void withdraw(int usrID, double amount) {
		if (checkUser(usrID) && amount <= getBalance()) {
			balance -= amount;
			this.nTransactions++;
		}	
	}

	@Override
	public void deposit(int usrID, double amount) {
		if (checkUser(usrID)) {
			balance += amount;
			this.nTransactions++;
		}	
	}

	@Override
	public void depositFromATM(int usrID, double amount) {
		if (checkUser(usrID)) {
			balance += amount;
			balance -= ATM_TRANSACTION_FEE; 
			this.nTransactions++;
		}
	}

	@Override
	public void withdrawFromATM(int usrID, double amount) {
		if (checkUser(usrID) && amount + ATM_TRANSACTION_FEE <= getBalance()) {
			balance += amount;
			balance -= ATM_TRANSACTION_FEE; 
			this.nTransactions++;
		}
	}

	@Override
	public void chargeManagementFees(int usrID) {
		balance -= (MANAGEMENTS_FEE * (getTransactionsCount()*0.1));
	}

	@Override
	public int getTransactionsCount() {
		return this.nTransactions;
	}
	
	
}
