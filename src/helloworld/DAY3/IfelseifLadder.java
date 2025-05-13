//28-04-2025
package helloworld.DAY3;
import java.util.Scanner; 

public class IfelseifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=10,b=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (a>b) {
			System.out.println("a is greater tha b");
		} else if (b>a) {
			System.out.println("b is greater than a");
		}else {
			System.out.println("both are equal");
		}
		
		sc.close();
		

	}

}
