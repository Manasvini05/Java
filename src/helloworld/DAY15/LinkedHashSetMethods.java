//14-05-2025
package helloworld.DAY15; 

import java.util.*;

public class LinkedHashSetMethods {  //methods of linked hash set

	public static void main(String[] args) {
		LinkedHashSet<String> s=new LinkedHashSet<>();

		//1. adding elements to set
		s.add("apple");
		s.add("banana");
		s.add("cherry");
		s.add("pineapple");
		s.add("grapes");
		
		System.out.println("Set 1 :"+s);
		
		LinkedHashSet<String> v=new LinkedHashSet<>();
		
		//1. adding elements to set
		v.add("mango");
		v.add("grapes");
		v.add("dragon fruit");
		
		System.out.println("Set 2 : "+v);
		System.out.println(" ");
		//2. printing the size
		System.out.println("Size of Set 1 : "+s);
		System.out.println("Size of Set 2 : "+v);
		System.out.println(" ");
		
		//3. to check if the set contains an object or not
		System.out.println("Does Set 1 contain 'mango'? : "+s.contains("mango"));
		System.out.println("Does Set 2 contain 'dragon fruit'? : "+v.contains("dragon fruit"));
		System.out.println(" ");
		
		//4. to remove an object 
		s.remove("banana");
		System.out.println("Set 1 after removing an object : "+s);
		v.remove("mango");
		System.out.println("Set 2 after removing an object : "+v);
		System.out.println(" ");
		
		//5.to check whether the set is empty or not 
		System.out.println("Is Set 1 empty? : "+s.isEmpty());
		System.out.println("Is Set 2 empty? : "+v.isEmpty());
		System.out.println(" ");
		
		//6.to add all and to link both sets
		s.addAll(v);
		System.out.println("Combained set of set 1 and set2 : "+s);
		System.out.println(" ");
		
		//7. to check which is a common object in both sets 
		System.out.println("Is there a common fruit? : "+s.containsAll(v));
		System.out.println(" ");
		
		//8.to remove the set2 from set1 
		s.removeAll(v);
		System.out.println("set 2 is removed from set1 : "+s);
		System.out.println(" ");
		
		//9. to retain
//		 s.add("Grape");
//	     s.add("Mango");
//	    v.retainAll(Collections.singleton("dargon furit"));
//	        System.out.println("retained? : " + v);
//	        
//	     Iterator <String> t=  s.iterator();
//	        while (t.hasNext()) {
//	            System.out.print(t.next() + " ");
//	        }
//	        System.out.println();

		
	}

}
