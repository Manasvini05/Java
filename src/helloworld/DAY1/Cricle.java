//25-04-2025
package helloworld.DAY1;
//import static java.lang.Math.PI;
import java.util.Scanner;

//import helloworld.Math;

public class Cricle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("DEMO");
		double radius = 6.5;
//		double a=Math.PI*radius*radius;
		System.out.print("area = ");
		System.out.println( Math.PI * radius * radius);
		System.out.print("peimeter = ");
		System.out.println(2 * Math.PI * radius);
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius of circle is  ");
		double r=sc.nextDouble();
		
		double area=Math.PI * r * r;
		double peri=2 * Math.PI * r;
		System.out.println(" ");
		System.out.println("area is "+area);
		System.out.println("primeter is "+peri);
		sc.close();
		
	}

}
