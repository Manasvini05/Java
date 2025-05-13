//01-05-2025
package helloworld.DAY6;
class Account{
	void openAccount() {
		System.out.println("Your acc has been opened!");
	}
}
class SavingsAccount extends Account{
	void depositSavings() {
		System.out.println("This is a savings account. Depoist the amount you want to save");
	}
}
class CurrentAccount extends Account{
	void issuechequeBook() {
		System.out.println("this is cureent account. your cheque book is issued!");
	}
}

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s1= new SavingsAccount();
		s1.openAccount();
		s1.depositSavings();
		
		System.out.println(" ");
		
		CurrentAccount c1= new CurrentAccount();
		c1.openAccount();
		c1.issuechequeBook();
		

	}

}
