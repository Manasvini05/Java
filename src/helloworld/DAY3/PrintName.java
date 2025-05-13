//28-04-2025
package helloworld.DAY3;
import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        String name="mana";
//        for(int i=0;i<10;i++) {
//        	System.out.println(i+" " +name);
//        }
        
        int i=0;
        while(i<10) {
        	System.out.println(name);
        	i++;
        }
        
//        int i=0;
//        do {
//        	System.out.println(name);
//        	i++;
//        }while(i<10);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String Name=sc.nextLine();
        
        for(int j=0;j<10;j++) {
        	System.out.println(Name);
        }
     
        sc.close();
        
	}

}
