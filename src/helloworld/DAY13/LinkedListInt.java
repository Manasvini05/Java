//12-05-2025
package helloworld.DAY13;
import java.util.LinkedList;

public class LinkedListInt {

	public static void main(String[] args) {
		
		LinkedList<Integer> num=new LinkedList<>();
		
		num.add(45);
		
		num.add(450);
		num.add(459);
		num.addFirst(973);
		num.add(745);
		num.addLast(5);
//		num.add(45);
		
		System.out.print("List of numbers are : { ");
		for(int nums : num) {
			System.out.print(nums+", ");
		}
System.out.println("}");

System.out.println("list "+num);
System.out.println("size :"+num.size());
System.out.println("first :"+num.getFirst());
System.out.println("Last :"+num.getLast());
System.out.println("index 4 :"+num.get(4));
System.out.println("remove 4 index :"+num.remove(4));
System.out.println("remove first :"+num.removeFirst());
System.out.println("remove last :"+num.removeLast());



	}

}
