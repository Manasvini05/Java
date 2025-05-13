//04-05-2025
package helloworld.DAY8;

class Coffee{
	void making() {
		System.out.println("milk,coffee and sugar");
	}
}
class Espresso extends Coffee{
	void making() {
		System.out.println("water,milk,coffee,sugar and vanilla");
	}
}
class Latte extends Coffee{
	void making() {
		System.out.println("coffee,water,sugar, almond milk, vanilla, whipped cream");
	}
}


public class Test1_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Espresso e=new Espresso();
		e.making();
		System.out.println(" ");
		Latte l=new Latte();
		l.making();
	}
}
