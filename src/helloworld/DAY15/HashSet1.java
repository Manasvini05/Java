//14-05-2025
package helloworld.DAY15;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
	
		
        HashSet<String> s1 = new HashSet<>();
        s1.add("Pineapple");
        s1.add("Banana");
        s1.add("Cherry");

        System.out.println("Set 1: " + s1);

        HashSet<String> s2 = new HashSet<>();
        s2.add("Banana");
        s2.add("Cherry");
        s2.add("Date");

        System.out.println("Set 2: " + s2);

        // 1. addAll() - Union
        HashSet<String> add = new HashSet<>(s1);  
        add.addAll(s2);
        System.out.println("combaining set 1 and set 2 : " + add);

        // 2. removeAll() - Difference
        HashSet<String> sub = new HashSet<>(s1);  
        System.out.println("Removing set 1 from set2 : " + sub);

        // 3. retainAll() - Intersection
        HashSet<String> Set = new HashSet<>(s1);  
        Set.retainAll(s2);
        System.out.println("Intersection of set1 a∩d set2): " + Set);



	}

}
