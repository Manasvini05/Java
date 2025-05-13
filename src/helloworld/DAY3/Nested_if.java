//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int age =23;
//boolean hasId=true;
//if (age >= 18) {
//	if(hasId) {
//		System.out.println("Eligible to vote");
//	}
//}else {
//	System.out.println("not above 18 years old");
//}
//	}

	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age");
	int Age=sc.nextInt();
Scanner sc1=new Scanner(System.in);
	System.out.println("Do you have id? (true/false)");
		Boolean haveId=sc1.nextBoolean();
	
	if (Age >= 18) {
		if(haveId) {
			System.out.println("Eligible to vote");
		}
	}else {
		System.out.println("not above 18 years old");
	}
	
	sc.close();
	sc1.close();
	
		}
	
	

}
