//29-04-2025
package helloworld.DAY4;     

public class Student {
	String name;
	String quali;
//	int marks;
	int exp;
	void display() { //method, mmothod name 'display()'
		System.out.println("name : "+name);//to diaply the values we passed
		System.out.println("qali : "+quali);
		System.out.println("exp : "+exp);
		
	}

	public static void main(String[] args) { //this is main method
		// TODO Auto-generated method stub //29-04-2025
		//create an object
		Student s1=new Student();
		s1.name="mana";
		s1.quali="b.tech";
		s1.exp=0;
		//to display through object we call the method 
		s1.display();
		//this wont take mmore than 1 value 
		//we need to use this keyword we can create n numb of objects without errors
		System.out.println("");
		Student s2=new Student();
		s2.name="sam";
		s2.quali="b.pd";
		s2.exp=1;
		s2.display();

	}

}
