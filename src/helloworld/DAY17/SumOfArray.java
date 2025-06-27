//19-05-2025
package helloworld.DAY17;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] n= {1,5,6,8,9,0,45};
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum+=n[i];
		}
		System.out.println("sum is "+sum);
	}

}
