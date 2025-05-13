//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //28-04-2025
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int day=sc.nextInt();
//		int day=2;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satarday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
	    default:
	    	System.out.println("invalid day ");
				
		}
		sc.close();

	}

}
