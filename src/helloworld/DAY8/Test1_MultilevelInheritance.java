//04-05-2025
package helloworld.DAY8;
class Socket{
	void step1() {
		System.out.println("Find the socket ");
	}
}
class Adapter extends Socket{
	void step2() {
		System.out.println("insert the adapter into the socket");
	}
}
class ChargerPin extends Adapter{
	void step3() {
		System.out.println("coonect your device to the charging pin ");
	}
}

public class Test1_MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChargerPin c=new ChargerPin();
		c.step1();
		c.step2();
		c.step3();

	}

}
