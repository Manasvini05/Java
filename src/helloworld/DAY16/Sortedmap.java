//15-05-2025
package helloworld.DAY16;
import java.util.*;
public class Sortedmap {

	public static void main(String[] args) {
		
        SortedMap<String,Integer> s=new TreeMap<>();
       s.put("tree",60);
       s.put("apple",100);
       s.put("fruit",45);
       s.put("vegetables",89);
       
       
       System.out.println("SortedMap: " + s); 
       System.out.println("First Key: " + s.firstKey());  
       System.out.println("Last Key: " + s.lastKey());   
       System.out.println("Head Map: " + s.headMap("fruit"));  
       System.out.println("Tail Map: " + s.tailMap("vegetable"));  
       System.out.println("Sub Map: " + s.subMap("apple", "tree")); 
       System.out.println("Comparator: " + s.comparator());  

       

	}

}
