//14-05-2025
package helloworld.DAY15;

import java.util.LinkedHashSet;

public class Sets {

	public static void main(String[] args) {
		LinkedHashSet<String> b=new LinkedHashSet<>();
		
		b.add("furits");
		b.add("capitals");
		b.add("vegetables");
		b.add("juice");
		b.add("breakfast");
		b.add("meals");
		b.add("banana");
		b.add("juice"); //duplicate is not added 
		
		System.out.println(b);
		

	}

}
