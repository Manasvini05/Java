//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //28-04-2025
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 values");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		 if (a>b) {
			 if(a>c) {
				 System.out.println("a is greater");
			 }else {
				 System.out.println("c is greater");
			 }
		 }else {
			 if(b>c) {
				 System.out.println("b is greater");
			 }else {
				 System.out.println("c is greater");
			 }
		 }
		

		 sc.close();
		 
	}

}
