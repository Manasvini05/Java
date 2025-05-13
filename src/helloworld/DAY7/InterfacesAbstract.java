//02-05-2025
package helloworld.DAY7;
interface vehicle{
	void start();
	default void stop() {
		System.out.println("vehicle stopped");
	}
}
class Cars implements vehicle{
	@Override 
	public void start() {
		System.out.println("car is starting");
	}
}
class Bike implements vehicle{
	@Override
	public void start() {
		System.out.println("Bike is starting");
	}
}

public class InterfacesAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars c=new Cars();
		c.start();
		c.stop();
		Bike b=new Bike();
		b.stop();
		b.start();
		

	}

}
