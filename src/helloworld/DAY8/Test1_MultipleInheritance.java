//04-05-2025
package helloworld.DAY8;
interface Mom{
	default void parent() {
		System.out.println("This is Mom");
	}
}
interface Dad{
	default void parent() {
		System.out.println("This is Dad");
	}
}
class Child implements Mom,Dad{
	public void parent() {
		Mom.super.parent();
		Dad.super.parent();
		System.out.println("this is child");
	}
	
}
public class Test1_MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.parent();

	}

}
