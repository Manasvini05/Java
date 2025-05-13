//29-04-2025
package helloworld.DAY3;

public class cars {
      
	String model,color,brand;
	float speed;
	int size;
	
	void setDeatails(String model,String color,String brand,float speed,int size) {
		this.model=model;
		this.color=color;
		this.brand=brand;
		this.speed=speed;
		this.size=size;
	}
	void display() {
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Brand : "+brand);
	}
	void Speed() {
		System.out.println("Speed of the car is : "+speed+"km/h");
	}
	void Size() {
		System.out.println("Size of this car is : "+size+"mm");
	}
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars c1=new cars();
		c1.setDeatails("Ertiga","Mehroon" , "Maruti",180,4395);
		c1.display();
		c1.Speed();
		c1.Size();
		
		System.out.println("   ");
		
		cars c2=new cars();
		c2.setDeatails("XUV500","BLACK" , "Mahindra",185,4585);
		c2.display();
		c2.Speed();
		c2.Size();

		System.out.println("");
		
		cars c3=new cars();
		c3.setDeatails("Swift","Red" , "Maruti",165,3860);
		c3.display();
		c3.Speed();
		c3.Size();
	}

}
