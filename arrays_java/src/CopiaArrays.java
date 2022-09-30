package geek;

import java.util.Arrays;

public class CopiaArrays {
	public static void main (String args []) {
		
	
	int num1 [] = new int [5]; 
	
	for (int i = 0; i < num1.length; i++) {
		num1 [i] = i + 1;
	}
	
	int [] num2 = new int [10];
	
	System.arraycopy(num1, 0,  num2,  0, num1.length);
	
	System.out.println ("Array num2 []"); 
	
	for (int n : num2) {
		System.out.print (n + " ");
	}
	
	System.arraycopy(num1,  2, num2, 6, 3);
	
	System.out.println ("\nArray num2 []");
	
	for (int n : num2) {
		System.out.print (n + " ");
	}
	
	
	
	}
}
