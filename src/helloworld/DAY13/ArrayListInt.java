//12-05-2025
package helloworld.DAY13;
import java.util.ArrayList;

public class ArrayListInt {

	public static void main(String[] args) {
	
		ArrayList<Integer> n=new ArrayList<>();
		n.add(4);
		n.add(7);
		n.add(78);
		n.add(7643);
		n.add(573);
		n.add(68);
		
		System.out.println("list "+n);
		System.out.println("saved integer are : "+ n.get(4));
		for(int i=0; i<n.size();i++) {
			System.out.println(i);
		}
		n.remove(2);
		System.out.println("list of numbers :");
		for(int i=0; i<n.size();i++) {
			System.out.println(i);
		}
		System.out.println("size : "+n.size());
		System.out.println("does it contain 78? "+n.contains(78));
		System.out.println("is list empty? "+n.isEmpty());
		n.clear();
		System.out.println("is list empty? "+n.isEmpty());
		
	}

}
