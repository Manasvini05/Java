//26-04-2025
package helloworld.DAY2;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//single variable
		int a=10;
		a+=5; //a+15
		System.out.println(a); //15
		
		a-=5; //15-5
		System.out.println(a); //10
		
		a*=5; //10*5
		System.out.println(a);//50
		
		a/=5; //50/5
		System.out.println(a); //10
		
		a%=5; //remeinder of 10/5
		System.out.println(a); //0
		
		//double variable
		int b=4,c;
		c=b; // c=4
		c+=b; //4+4
		System.out.println(c);//8
		c-=b; //8-4
		System.out.println(c); //4
		c*=b;//4*4
	    System.out.println(c);//16
	    c/=b; //16/4
	    System.out.println(c); //4
	    
	    c%=b; //4%4 reminder 
		System.out.println(c);//0
	    
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number ");
		int x=sc.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.print("enter another number ");
		int y=sc2.nextInt();
		System.out.println(" ");
		System.out.println("The Assignment of the numbers are as follows");
		System.out.println(x+=y);
		System.out.println(x-=y);
		System.out.println(x*=y);
		System.out.println(x/=y);
		System.out.println(x%=y);
		System.out.println(" ");
		
		Scanner sc3=new Scanner(System.in);
		System.out.print("you can do Assignments with one number as well. Let's try it!. Enter your fav number ");
		int z=sc3.nextInt();
		z+=5;
		System.out.print("z+=5 is ");
		System.out.println(z);
		z-=5;
		System.out.print("z-=5 is ");
		System.out.println(z);
		z*=5;
		System.out.print("z*=5 is ");
		System.out.println(z);
		z/=5;
		System.out.print("z/=5 is ");
		System.out.println(z);
		z%=5;
		System.out.print("z%=5 is ");
		System.out.println(z);
		System.out.println(" ");
		System.out.println("rember that the value gets upadted with each assignment  ");
		
		
		sc.close();
		sc2.close();
		sc3.close();
		
		
	}

}
