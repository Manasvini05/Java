package helloworld.Test03;

public class Test3_NonRepeatingChar {
	public static void main (String[] args) {
		String s="swiss";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			boolean nrc=true;
			
			for (int j=0;j<s.length();j++) {
				if(i !=j && s.charAt(j)==c) {
					nrc =false;
					break;
				}
			}
			if(nrc) {
				System.out.println(" '"+c+"'");
				return;
			}
			
		}
	}

}
