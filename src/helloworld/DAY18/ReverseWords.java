//20-05-2025
package helloworld.DAY18;

public class ReverseWords {

	public static void main(String[] args) {
		String word="Hello word";
		String[] save=word.split(" ");
		
	    for(int i=save.length-1;i>=0;i--) {
	    	System.out.print(save[i]+" ");
	    }
		
		

	}

}
