//01-05-2025
package helloworld.DAY6;
class bag{
	void items() {
		System.out.println("toys are in the bag");
	}
}
class robot2 extends bag{
	void items() {
		System.out.println("robot is in the bag");
	}
}

public class OverrideMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bag b1=new bag();
		b1.items();
		robot2 r1= new robot2();
		r1.items();

	}

}
