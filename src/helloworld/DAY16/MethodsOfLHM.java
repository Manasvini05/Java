//15-05-2025
package helloworld.DAY16;
import java.util.*;
public class MethodsOfLHM {

	public static void main(String[] args) {
		
		  LinkedHashMap <String, Integer> m = new LinkedHashMap<>();

            m.put("Apple", 5);
            m.put("cherry", 15);
            m.put("grapes", 50);
            m.put("banana", 45);
            m.put("Pineapple",65);
            
	        System.out.println("Get Banana: " + m.get("banana"));
	        System.out.println("Contains key 'Apple': " + m.containsKey("Apple"));
	        System.out.println("Contains value 50: " + m.containsValue(50));
	        System.out.println("Key Set: " + m.keySet());
	        System.out.println("Values: " + m.values());
	        System.out.println("Entry Set: " + m.entrySet());

	        m.remove("Banana");
	        System.out.println("After removing Banana: "+m);

		
	}

}
