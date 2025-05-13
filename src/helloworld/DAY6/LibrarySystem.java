//01-05-2025
package helloworld.DAY6;
class Libraryitem {
	void checkIn() {
		System.out.println("Welcome to the library. Please check-in to continue");
	}
}
class book extends Libraryitem {
	void readBook() {
		System.out.println("select a book to read");
	}
}
class TextBook extends book{
	void solveExercises() {
		System.out.println("Slove the excercises in this textbook");
	}
}

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextBook t1=new TextBook();
		t1.checkIn();
		t1.readBook();
		t1.solveExercises();

	}

}
