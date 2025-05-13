//30-04-2025
package helloworld.DAY5;
class Animal2{
	void eat() {
		System.out.println("animal is eating");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("Dog is barking");
	}
}
class puppy2 extends Dog2{
	void weep() {
		System.out.println("puppy is weeping");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a1=new Animal2();
		a1.eat();
		System.out.println(" ");
		Dog2 d1=new Dog2();
		d1.bark();
		d1.eat();
		System.out.println(" ");
       puppy2 p1=new puppy2();
       p1.bark();
       p1.eat();
       p1.weep();
	}

}
