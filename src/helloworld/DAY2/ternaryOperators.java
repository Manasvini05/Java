//26-04-2025
package helloworld.DAY2;
import java.util.Scanner;
public class ternaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=9,b=8;
	    int res =(a<b)?a:b; 
	    System.out.println("min num is "+res);

		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number ");
		int num1 = sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("enter another number ");
		int num2 = sc1.nextInt();
		
		int result= (num1>num2)? num1:num2;
		System.out.println("if (num1>num2), if true = num1, if false = num2 ");
		System.out.println(result);
		
		
		sc.close();
		sc1.close();
		
	}

}
 