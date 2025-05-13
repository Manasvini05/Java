//29-04-2025
package helloworld.DAY4;
import java.util.Scanner;

public class carsScan {
	String model,color,brand;
	float speed;
	int size;
	
	void setDetails(String model,String color,String brand,float speed,int size) {
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
		Scanner sc=new Scanner(System.in);
		for(int i=0;i>3;i++) {
			System.out.println("Enter the model,color,brand,speed and size of your deram car");
//			carsScan[i] = new carsScan();
	
		}
		
		
		sc.close();
		
		

	}

}
