//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;
public class Multipication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		for (int i=1;i<=10;i++) {
			int mul=a*i;
			System.out.println(a+" * "+i+" = "+mul);
		}

		sc.close();

	}

}
