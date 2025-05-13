//02-05-2025
package helloworld.DAY7;
abstract class Animal0{
	abstract void sound(); //Abstract method
	void sleep() {
		System.out.println("Sleeping"); //concrete method
	}
}
class dogs extends  Animal0{
	@Override
	void sound() {
		System.out.println("dog barks");
	}
}

public class Abstract_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         dogs d1=new dogs();
         d1.sleep();
         d1.sound();
	}

}
