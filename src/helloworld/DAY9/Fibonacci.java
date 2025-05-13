//05-05-2025
package helloworld.DAY9;

public class Fibonacci {

	public static void main(String[] args) {
		int n=12;
		int one=0,two=1;
		System.out.print(one+" "+two+" ");
		for(int i=0;i<n;i++) {
			int next=one+two;
			System.out.print(next+" ");
			one=two;
			two=next;
			
		}

	}

}
