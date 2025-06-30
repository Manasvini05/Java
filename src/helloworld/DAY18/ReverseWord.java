//20=05-2025
package helloworld.DAY18;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one word");
		String str=sc.next();
		
	
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
