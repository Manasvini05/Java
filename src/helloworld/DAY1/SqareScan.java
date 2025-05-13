//25-04-2025
package helloworld.DAY1;
import java.util.Scanner;

public class SqareScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("DEMO");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("side of square?  ");
		int a=sc.nextInt();
		int area=a*a;
		int peri=4*a;
		System.out.println(" ");
		System.out.println("area is "+area);
		System.out.println("primeter is "+peri);
		
		sc.close();

	}

}
