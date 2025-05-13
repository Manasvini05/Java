//30-04-2025
package helloworld.DAY5;

interface A{ //this is parent class
	default void show() { //
		System.out.println("Default Method in A");
	}
}

interface B{
	default void show() {
		System.out.println("Default method in B");
	}
}
class C implements A,B{
	public void show() {
		System.out.println("Multiplre inheritance");
		A.super.show();
		B.super.show();
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.show();

	}

}
