//19-05-2025
package helloworld.DAY17;

public class FibonacciLogic {

	public static void main(String[] args) {
		
		int n=10;
		int first=0;
		int second=1;
		System.out.println(first+" "+second);
        for(int i=2;i<n;i++) {
        	int next=first+second;
        	System.out.print(next+" ");
        	first=second;
        	second=next;
        }
	}
}
