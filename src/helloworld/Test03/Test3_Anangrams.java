package helloworld.Test03;

import java.util.Arrays;

public class Test3_Anangrams {

	public static void main(String[] args) {
		
		String a="listen";
		String b="silent";
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.equals(c1,c2));

	}

}
