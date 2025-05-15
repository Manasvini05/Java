//14-05-2025
package helloworld.DAY15;

import java.util.*;
public class SortedSetInt {

	public static void main(String[] args) {

	
		        SortedSet<Integer> n = new TreeSet<>();
		        n.add(10);
		        n.add(5);
		        n.add(20);
		        n.add(15);

		        System.out.println("SortedSet: " + n);            
		        System.out.println("First: " + n.first());        
		        System.out.println("Last: " + n.last());          
		        System.out.println("HeadSet(15): " + n.headSet(15)); 
		        System.out.println("TailSet(10): " + n.tailSet(10)); 
		        System.out.println("SubSet(5, 20): " + n.subSet(5, 20)); 
		
	}

}
