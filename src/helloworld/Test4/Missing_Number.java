package helloworld.Test4;

public class Missing_Number {

	public static void main(String[] args) {
		
		
		        int[] arr = {1, 2, 4, 5}; 
		        int n = 5; 
		        int total = n * (n + 1) / 2;
		        int sum = 0;

		        for (int i = 0; i < arr.length; i++) {
		            sum += arr[i];
		        }

		        int missing = total - sum;
		        System.out.println( missing);
		    }
		}

