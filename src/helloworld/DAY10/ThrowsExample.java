//06-05-2025
package helloworld.DAY10;
//
//public class ThrowsExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ThrowsExample {
    // Declares that this method may throw IOException
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("HelloWorld.txt"); // May throw IOException
        BufferedReader br = new BufferedReader(fr);

        String line;
        System.out.println("File contents:");
        while ((line = br.readLine()) != null) {
            System.out.println(line); // Print each line of the file
        }

        br.close(); // Don't forget to close the BufferedReader
    }

    public static void main(String[] args) {
        try {
            readFile(); // We handle the exception here
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
