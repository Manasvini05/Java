//26-04-2025
package helloworld.DAY2;
import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=5,b=5,c=20;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st number ");
		int a=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("enter 2nd number ");
		int b=sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.print("enter 3rd number ");
		int c=sc2.nextInt();
		
		boolean res;
		res=(a==b)&&(c>b);
		System.out.println("(a==b)&&(c>b) is "+res);
		
		res=(a==b)&&(c<b);
		System.out.println("(a==b)&&(c<b) is "+res);
		
		res=(a==b)||(c>b);
		System.out.println("(a==b)||(c>b) is "+res);
		
		res=(a==b)||(c<b);
		System.out.println("(a==b)||(c<b) is "+res);
		
		res=!(a==b);
		System.out.println("!(a==b) is "+res);
		
		res=!(a!=b);
		System.out.println("!(a!=b) is "+res);
		
		res=(a!=b)&&(c>b);
		System.out.println("(a!=b)&&(c>b) is "+res);
		
		res=(a!=b)&&(c<b);
		System.out.println("(a!=b)&&(c<b) is "+res);
		
		sc.close();
		sc1.close();
		sc2.close();
		
	}

}
