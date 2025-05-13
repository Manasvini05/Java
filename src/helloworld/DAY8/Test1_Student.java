//04-05-2025
package helloworld.DAY8;

public class Test1_Student {
String name;
int age;
double grade;
void displayDeatils() {
	System.out.println("Name of the studen is "+name);
	System.out.println("Age of the studen is "+age);
	System.out.println("Grade of the studen is "+grade);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Test1_Student s1=new Test1_Student();
		Test1_Student s2=new Test1_Student();
		s1.name="Mana";
		s1.age=22;
		s1.grade=88.91;
		s1.displayDeatils();
		System.out.println(" ");
		s2.name="Sammy";
		s2.age=23;
		s2.grade=91.8;
		s2.displayDeatils();
				
	}

}
