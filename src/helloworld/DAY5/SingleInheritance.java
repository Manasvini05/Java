//30-04-2025
package helloworld.DAY5;
class animal{
	void eat() {
		System.out.println("animal is eating");
	}
}
class Dog extends animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a1=new animal();
		a1.eat();
//		a1.bark(); //dog feathers cannot be called
		Dog d1=new Dog();
		d1.eat();
		d1.bark();

	}

}
