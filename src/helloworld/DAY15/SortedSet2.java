//14-05-2025
package helloworld.DAY15;
import java.util.*;
public class SortedSet2 {

	public static void main(String[] args) {
		
		        SortedSet<String> fruits = new TreeSet<>();

		        // 1. add(E e)
		        fruits.add("Banana");
		        fruits.add("Apple");
		        fruits.add("Mango");
		        fruits.add("Orange");
		        fruits.add("Grapes");

		        System.out.println("Fruits set: " + fruits);

		        System.out.println(" ");
		        // 2. remove(Object o)
		        fruits.remove("Mango");
		        System.out.println("Set after removing : " + fruits);
		        System.out.println(" ");

		        // 3. first()
		        System.out.println("First (lowest) element: " + fruits.first());
		        System.out.println(" ");
		        
		        // 4. last()
		        System.out.println("Last (highest) element: " + fruits.last());
		        System.out.println(" ");
		        
		        // 5. headSet(E toElement)
		        System.out.println("headSet(\"Orange\"): " + fruits.headSet("Orange")); // Elements < Orange
		        System.out.println(" ");
		        
		        // 6. tailSet(E fromElement)
		        System.out.println("tailSet(\"Grapes\"): " + fruits.tailSet("Grapes")); // Elements >= Grapes
		        System.out.println(" ");
		        
		        // 7. subSet(E from, E to)
		        System.out.println("subSet(\"Banana\", \"Orange\"): " + fruits.subSet("Banana", "Orange"));
		        System.out.println(" ");
		        
		        // 8. size()
		        System.out.println("Size of set: " + fruits.size());
		        System.out.println(" ");
		        
		        // 9. isEmpty()
		        System.out.println("Is the set empty? " + fruits.isEmpty());
		        System.out.println(" ");
		        
		        // 10. contains(Object o)
		        System.out.println("Does set contain 'Apple'? " + fruits.contains("Apple"));
		        System.out.println(" ");
		        
		        // 11. clear()
		        fruits.clear();
		        System.out.println("After clear(), is the set empty? " + fruits.isEmpty());
		        System.out.println(" ");
		    }
		}
