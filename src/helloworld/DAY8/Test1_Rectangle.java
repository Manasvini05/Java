//04-05-2025
package helloworld.DAY8;

public class Test1_Rectangle {
	double length;
	double width;
	void area() {
		double  area = length*width;
		System.out.println("area of the rectangle is "+area);
		
	}
 void perimeter() {
	 double perimeter=length+width;
	 System.out.println("perimeter of rectangle is "+perimeter);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_Rectangle r1=new Test1_Rectangle();
		Test1_Rectangle r2=new Test1_Rectangle();
		r1.length=45.7;
		r1.width=50.3;
		r1.area();
		r1.perimeter();
        System.out.println(" ");
        r2.length=54.9;
		r2.width=60.8;
		r2.area();
		r2.perimeter();
	}

}
