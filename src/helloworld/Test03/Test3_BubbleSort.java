package helloworld.Test03;

import java.util.Arrays;

public class Test3_BubbleSort {

	public static void main(String[] args) {
		
		        int[] n = {6, 3, 0, 5, 1};

		    
		        for (int i = 0; i < n.length - 1; i++) {
		            for (int j = 0; j < n.length - 1 - i; j++) {
		                if (n[j] > n[j + 1]) {
		                    
		                    int temp = n[j];
		                    n[j] = n[j + 1];
		                    n[j + 1] = temp;
		                }
		            }
		        }

		        System.out.println(Arrays.toString(n));
		    }
		}


	
