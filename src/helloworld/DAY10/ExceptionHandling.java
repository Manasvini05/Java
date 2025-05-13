//06-05-2025
package helloworld.DAY10;

public class ExceptionHandling {

	public static void main(String[] args) {
//		int a=10;
//		int b=0;
//		int r=a/b;
//		System.out.println(r);
		try {
			int b=5/0;
			System.out.println(b);
		}
catch (ArithmeticException e) {
	System.out.println("cannot be divided by 0");
	
}
	}

}
