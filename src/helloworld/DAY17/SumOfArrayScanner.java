//19-05-2025
package helloworld.DAY17;

import java.util.Scanner;

public class SumOfArrayScanner {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N numbers to sum up");
		int n=sc.nextInt();
		int sum=0;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			System.out.println("sum of first "+ n
					+ " number is "+sum);
		}else {
			System.out.println("enter positive number");
		}
		
	
	}

}
