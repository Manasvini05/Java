//05-05-2025
package helloworld.DAY9;
class Math{
	static int count=1;
	static void display() {
		System.out.println("Count is : "+count);
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
	     Math.count++;
	     Math.display();

	}

}
