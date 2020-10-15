package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
		AccountHolder marioHolder = new AccountHolder("Mario", "Rossi", 1);
		AccountHolder luigiHolder = new AccountHolder("Luigi", "Bianchi", 2);
		System.out.println(marioHolder.toString());
		System.out.println(luigiHolder.toString());
		System.out.println("OPERATIONS");
		SimpleBankAccount mAccount = new SimpleBankAccount(1, 0, 0);
		System.out.println("Mario has " + mAccount.getBalance() + " dollars");
		System.out.println("Mario has done " + mAccount.getnTransactions() + " transitions");
		mAccount.deposit(1,500); 
		System.out.println("Mario has earned 500 dollars");
		System.out.println("Mario has " + mAccount.getBalance() + " dollars");
		SimpleBankAccount lAccount = new SimpleBankAccount(2,0,0);
		System.out.println("Luigi has " + lAccount.getBalance() + " dollars");
		System.out.println("Luigi has done " + lAccount.getnTransactions() + " transitions");
		lAccount.deposit(2,700); 
		System.out.println("Luigi has earned 700 dollars");
		System.out.println("Luigi has " + lAccount.getBalance() + " dollars");
    }
}
