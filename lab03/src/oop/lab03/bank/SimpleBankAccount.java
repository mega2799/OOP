package oop.lab03.bank;

public class SimpleBankAccount {

	private int userID;
	private double balance;
    private int nTransactions;
    
	static double ATM_TRANSACTION_FEE = 1;
	
	public SimpleBankAccount(final int userID, final double balance, final int nTransactions){
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

	public void deposit(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto Nota: il deposito va a buon fine solo se l'id utente
         * corrisponde
         */
		if (checkUser(usrID)) {
			balance += amount;
			this.nTransactions++;
		}
	}

    public void withdraw(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount al totale del
         * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
         * Il prelievo va a buon fine solo se l'id utente corrisponde
         */
		if (checkUser(usrID)) {
			balance -= amount;
			this.nTransactions++;
		}

    }

    public void depositFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
    	if (checkUser(usrID)) {
			balance += amount;
			balance -= ATM_TRANSACTION_FEE; 
			this.nTransactions++;
		}

    }

    public void withdrawFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
    	if (checkUser(usrID)) {
			balance += amount;
			balance -= ATM_TRANSACTION_FEE; 
			this.nTransactions++;
		}

    }

    /* Utility method per controllare lo user */
    private boolean checkUser(final int id) {
        return this.userID == id;
    }
}
