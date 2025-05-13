//01-05-2025
package helloworld.DAY6;
class bank{
	void display(double a) {
		System.out.println("Amount : "+a);
	}
	void display(double a,String b) {
		System.out.println("Amount : "+a+
				"\nAccount number : "+b);
	}
	void display(String branch,double a, String b) {
		System.out.println("Branch : "+branch+
				"\nAmount : "+a+
				"\nAccount number : "+b);
	}
}

public class BankOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank b1=new bank();
		b1.display(2386);
		b1.display(2345,"BGY45167907");
		b1.display("Raidurg", 45370, "BYYG245167907");

	}

}
