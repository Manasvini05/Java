//25-04-2025
package helloworld.DAY1;
import java.util.Scanner;

public class SelfIntro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("hello");
		String name="manasvini";
		int age= 345;
		String edu="b.tech";
		float gpa=97.4f;
		char gender='A';
		boolean isfresher=true;
		System.out.println("BELOW IS THE DEMO ON HOW YOUR INPUT WILL BE DISPLAYED");
		System.out.println("My name is "+name);
		System.out.println("My age "+age);
		System.out.println("My gender "+gender);
		System.out.println("My education is "+edu);
		System.out.println("GPA "+gpa);
		System.out.println("I am fresher "+isfresher);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter you name :");
		String Name=sc.nextLine();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("your age?");
		int Age=sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.print("your education qualification?");
		String Edu=sc2.nextLine();
		
		Scanner sc3=new Scanner(System.in);
		System.out.print("what is your CGPA?");
		double Gpa=sc3.nextDouble();
		
		Scanner sc4=new Scanner(System.in);
		System.out.print("gender?");
		char Gender=sc4.next().charAt(0);
		
		Scanner sc5= new Scanner(System.in);
		System.out.print("are you a fresher?");
		String isNew=sc5.nextLine();
		System.out.println("  ");
		System.out.println("Name : "+ Name+
				"\nAage : "+Age+
				"\nGender : "+Gender+
				"\nEducation : "+Edu+
				"\nCGPA : "+Gpa+
				"\nFresher : "+isNew);
		
		sc.close();
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		
	}

}
