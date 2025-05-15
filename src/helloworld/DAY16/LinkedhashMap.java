//15-05-2025
package helloworld.DAY16;
import java.util.*;
public class LinkedhashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> h=new HashMap<>();
		Map<String, Integer> l=new LinkedHashMap<>();
		
		h.put("Mana",22);
		h.put("Sam",21);
		h.put("Mala",23);
		h.put("Yash",19);
		
		l.put("Praha", 15);
		l.put("Shank", 20);
		l.put("Rohan", 21);
		l.put("Harsh", 20);

		System.out.println(h);
		System.out.println(l);
	}

}
