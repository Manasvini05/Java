//05-05-2025
package helloworld.DAY9;

public class ArrayMax {

	public static void main(String[] args) {
		int[] n= {1,3,5,72,90,3,5};
		int max=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max=n[i];
			}
		}
      System.out.println("the max number in an array is "+max);
	}

}
