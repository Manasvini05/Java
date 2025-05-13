//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //28-04-2025
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 3 values and a name");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		
//		int a=10,b=9,c=8;
		if(a>b&&a>c) {
			System.out.println("a is greatest");
		}else if (b>c&&b>a) {
			System.out.println("b is geatest");
		}else {
			System.out.println("c is greatsest");
		}

		sc.close();
		
	}

}
