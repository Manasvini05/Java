//25-04-2025
package helloworld.DAY1;
import java.util.Scanner;

public class ArithemeticScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter 2nd number");
		int b=sc1.nextInt();
		System.out.println(" ");
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Sum = "+ sum);
		System.out.println("Sub = "+ sub);
		System.out.println("Mul = "+ mul);
		System.out.println("Div = "+ div);
		System.out.println("Mod = "+ mod);
		
		sc.close();
		sc1.close();
	
	}

}
