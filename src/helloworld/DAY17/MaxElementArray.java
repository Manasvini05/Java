//19-05-2025
package helloworld.DAY17;

public class MaxElementArray {

	public static void main(String[] args) {
		
		int[] num= {10,9,67,98,3,6,78};
		int max=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		
		}

		System.out.println("max "+max);
	}

}
