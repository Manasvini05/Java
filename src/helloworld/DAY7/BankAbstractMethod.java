//02-05-2025
package helloworld.DAY7;
abstract class ATM{
	abstract void withdraw(double amt);
	abstract void deposit(double amt);
	abstract void checkbalance();
	void welcome() {
		System.out.println("Welcome to the ATM");
	}
	
}
 class BankATM extends ATM{
	private double bal=100000;
	@Override
	void withdraw(double amt) {
		if (amt>bal) {
			System.out.println("insufficient balance");
		}else {
			 bal-=amt;
			System.out.println("withdraw : "+amt);
		}
		
	}
	@Override
	void deposit(double amt ) {
		bal+=amt;
		System.out.println("Deposited : "+amt);
	}
	@Override 
	void checkbalance() {
		System.out.println("current balance : "+bal);
	}
}

public class BankAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankATM a1=new BankATM();
		a1.welcome();
		a1.deposit(2000);
		a1.withdraw(4000);
		a1.checkbalance();
		
		

	}

}
