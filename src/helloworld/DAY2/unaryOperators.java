//26-04-2025
package helloworld.DAY2;
import java.util.Scanner;


public class unaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int a=5;
		System.out.println(a++); //first print then add so, / output 5 // 5+1=6 //6 
		System.out.println(++a); // the value got upadated to 6 //first add then print , so , 6+1 =7 //output 7
		System.out.println(--a); // the value got upadated to 7 //first sub then print , so , 7-1=6 //output 6
		System.out.println(a--); //the value got upadated to 6 // first print then add , //output 6 //6-1=5
		System.out.println(-a); //the value got upadated to 5 // -a = -5
		System.out.println(+a); //the value got upadated to -5 //+a=+5 or 5 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int b=sc.nextInt();
		System.out.println(++b); 
		System.out.println(b++);
		System.out.println(b--);
		System.out.println(--b);
		System.out.println(-b);
		System.out.println(+b);
		
		sc.close();
		
	}

}
