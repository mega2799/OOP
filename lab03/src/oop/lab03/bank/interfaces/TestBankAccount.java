package oop.lab03.bank.interfaces;

import oop.lab03.bank.AccountHolder;

public final class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1
         */
        /*
         * 2) Creare l' AccountHolder relativo a Luigi Bianchi con id 2
         */
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di Mario
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Luigi Bianchi (ammontare iniziale = 0)
         */
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        /*
         * 6) Prelevare €15000 da entrambi i conti
         */
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        /*
         * 8) Qual è il risultato e perché?
         */
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        /*
         * 12) Qual è il risultato e perché?
         */
    	
    	oop.lab03.bank.AccountHolder marioHolder = new oop.lab03.bank.AccountHolder("Mario", "Rossi", 1);
    	oop.lab03.bank.AccountHolder luigiHolder = new oop.lab03.bank.AccountHolder("Luigi", "Bianchi", 2);
		BankAccount mBankAccount = new SimpleBankAccount(1, 1000, 0);	
		BankAccount lBankAccount = new StrictBankAccount(2, 4000, 0);
		mBankAccount.deposit(1,10000);	
		lBankAccount.deposit(2,10000);
		System.out.println("Now this nigga got more ICE " + mBankAccount.getBalance() + "total dollars" );
		System.out.println("Now this nigga got more ICE " + lBankAccount.getBalance() + "total dollars" );
		mBankAccount.deposit(1,10000);	
		lBankAccount.deposit(2,10000);
		mBankAccount.chargeManagementFees(1);	
		lBankAccount.chargeManagementFees(2);	
		System.out.println("Now this nigga got less ICE.... " + mBankAccount.getBalance() + "total dollars" );
		System.out.println("Now this nigga got less ICE.... " + lBankAccount.getBalance() + "total dollars" );
	}
}
