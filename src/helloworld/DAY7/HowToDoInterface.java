//02-05-2025
package helloworld.DAY7;
interface Vehicle{
	void start();
	default void stop() {
		System.out.println("Vehicle is stopped");
	}
	
}
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("car is starting");
	}
}

public class HowToDoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c=new Car();
        c.start();
        c.stop();
        		
	}

}
