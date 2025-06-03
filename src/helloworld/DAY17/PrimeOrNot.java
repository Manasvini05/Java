//19-05-2025
package helloworld.DAY17;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
				Scanner sc1 = new Scanner(System.in);
				System.out.println("enter a number");
				int number=sc1.nextInt();
				sc1.close();
				boolean isPrime=true;
				for(int i=2;i<number/2;i++)
				{
					if(number%i==0)
					{
						isPrime=false;
						break;
					}
				}
				if (isPrime)
				{
					System.out.println("prime number");
					}
					else
					{
						System.out.println(" not prime number");
					}
				}

		
	}


