//02-05-2025
package helloworld.DAY7;
interface ATMop{
	void withdraw(double amt);
	void deposit(double amt);
	void checkbal();
	default void pin() {
		System.out.println("enterpin");
	}
}
class ATMimpl implements ATMop{
	private double bal=90000;
	public void withdraw(double amt) {
		if(amt>bal) {
			System.out.println("insufficient balance");
		}else {
			bal-=amt;
			System.out.println("withdraw: "+amt);
		}
	}
	public void deposit(double amt) {
		bal+=amt;
		System.out.println("desposit : "+amt);
	}
	public void checkbal() {
		System.out.println("current bal : "+bal);
	}
}

public class ATMoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ATMimpl atm=new ATMimpl();
atm.pin();
atm.deposit(4409.4);
atm.pin();
atm.withdraw(500.98);
atm.pin();
atm.checkbal();
	}

}
