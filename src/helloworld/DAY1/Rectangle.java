//25-04-2025
package helloworld.DAY1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("DEMO");
		int length = 7;
		int breath = 10;
		System.out.print("area = ");
		System.out.println(length*breath);
		System.out.print("peimeter = ");
		System.out.println(2*(length+breath));
		Scanner sc=new Scanner(System.in);
		System.out.print("length of rectangle?  ");
		int l=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("breath of rectangle?  ");
		int b=sc1.nextInt();
		
		 double area=l*b;
		int peri=2*(l+b);
		System.out.println(" ");
		System.out.println("area is "+area);
		System.out.println("primeter is "+peri);
		
		sc.close();
		sc1.close();

	}

}
