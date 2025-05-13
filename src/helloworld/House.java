package helloworld;
import java.util.Scanner;

public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner a=new Scanner(System.in);	
			System.out.println("Enter name: ");
			System.out.println("College: ");
			System.out.println("Branch: ");
			System.out.println("Hobbies: ");

			String name=a.next();
			a.nextLine(); 
			String College=a.nextLine();
			String Branch=a.nextLine();
			String Hobbies=a.nextLine();
			
		
			System.out.println("CGPA: ");
			float CGPA=a.nextFloat();
			
			System.out.println("Enter age: ");
			int age=a.nextInt();
			
			System.out.println("EXP: ");
			int EXP=a.nextInt();
			
			System.out.println("your name is: "+name);
			System.out.println("your college is: "+College);
			System.out.println("your branch is: "+Branch);
			System.out.println("your hobbies is: "+Hobbies);
			System.out.println("your CGPA is: "+CGPA);
			System.out.println("your age is: "+age);
			System.out.println("your Experice is: "+EXP);
	
			
			
			
			
	}
}
