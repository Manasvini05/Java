//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;

public class GreastestofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //28-04-2025
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 values");
		int a,b;
	    a=sc.nextInt();
	    b=sc.nextInt();
	    if(a>b) {
	    	System.out.println(a+" is greater");
	    }else {
	    	System.out.println(b+" is greater");
	    }

	    sc.close();
	    
	}

}
