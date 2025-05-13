//06-05-2025

package helloworld.DAY10;
import java.io.*;

public class CheckedException {

	public static void main(String[] args) {

		try {
			FileReader fr=new FileReader("HelloWorld.txt");
		}catch(FileNotFoundException e) {
			System.out.println("File not found : "+ e.getMessage());
		}
	}

}
