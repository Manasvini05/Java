package helloworld.Test4;

public class NonRepeating_String {
	public static void main (String[] args) {
		String str="swiss";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			boolean nrs=true;
			
			for (int j=0;j<str.length();j++) {
				if(i !=j && str.charAt(j)==c) {
					nrs =false;
					break;
				}
			}
			if(nrs) {
				System.out.println(" '"+c+"'");
				return;
			}
			
		}
	}

}
