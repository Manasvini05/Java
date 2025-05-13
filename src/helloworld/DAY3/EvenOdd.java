//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num to check wether is even or odd");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("the number is even");
		}else if(a==0) {
			System.out.println("the number is 0");
		}else {
			System.out.println("the number is odd");
		}
		
		sc.close();
		
	}

}
