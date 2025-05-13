//06-05-2025
package helloworld.DAY10;

public class FinalBlock {

	public static void main(String[] args) {
		try {
			int d=9/0;
			
		}catch(ArithmeticException e) {
			System.out.println("Exception caught");
		}
		finally {
			System.out.println("final block will always excute");
		}

	}

}
