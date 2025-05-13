//25-04-2025
package helloworld.DAY1;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("DEMO");
		int a = 7;
		int b= 8;
		int c=6;
		int base=8;
		double height = 6.5;
		System.out.print("area = ");
		System.out.println((base*height)/2);
		System.out.print("peimeter = ");
		System.out.println(a+b+c);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("length of side 1?  ");
		int A=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("length of side 2?  ");
		int B=sc1.nextInt();
		
		Scanner sc3=new Scanner(System.in);
		System.out.print("length of side 3?  ");
		int C=sc3.nextInt();
		
		Scanner sc4=new Scanner(System.in);
		System.out.print("base of triangle?  ");
		int Base=sc.nextInt();

		Scanner sc5=new Scanner(System.in);
		System.out.print("height of triangle?  ");
		double H=sc.nextDouble();
		
		double area=(Base*H)/2;
		double peri=A+B+C;
		System.out.println(" ");
		System.out.println("area is "+area);
		System.out.println("primeter is "+peri);
		
		sc.close();
		sc1.close();
		sc3.close();
		sc4.close();
		sc5.close();
		
	}

}
