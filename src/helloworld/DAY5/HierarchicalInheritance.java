//30-04-2025
package helloworld.DAY5;
class Animal3{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class dog extends Animal3{
	void bark() {
		System.out.println("dog is barking");
	}
}
class cat extends Animal3{
	void meow() {
		System.out.println("cat is meowing");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal3 a1=new Animal3();
       a1.eat();
       System.out.println(" ");
       dog d1=new dog();
       d1.bark();
       d1.eat();
       System.out.println(" ");
       cat c1=new cat();
       c1.eat();
       c1.meow();
//       c1.bark();
	}

}
