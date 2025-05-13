//05-05-2025
package helloworld.DAY9;
final class Empolyee{
	final int id=423;
	final void work() {
		System.out.println("employee works for company");
	}		
}

public class FinalKeyword {

	public static void main(String[] args) {
	Empolyee e=new Empolyee();
	System.out.println("Id : "+e.id);
	e.work();

	}

}
