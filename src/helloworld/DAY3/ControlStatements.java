//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; //use scanner
		if (n>0) {
			System.out.println("Number is positive"); //if the condition is true the this will be excuted
			}else {
				System.out.println("Number is negative");
			}
		
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        if (a>0) {
			System.out.println("Number is positive"); //if the condition is true the this will be excuted
			}else {
				System.out.println("Number is negative");
			}
        
        sc.close();
	}

}
