package geek;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsandoArrays {

	public static void main (String args []) {

		Integer numeros [] = new Integer [10];

		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = (int) (Math.random() * 100); 
		}	  

		System.out.println ("Array original:");

		for (int n : numeros) {
			System.out.println (n);
		}

		System.out.println ("Array em ordem crescente:");

		Arrays.sort (numeros);

		for (int n : numeros) {
			System.out.println (n);		  
		}

		System.out.println ("Array em ordem decrescente:");

		Arrays.sort (numeros, Collections.reverseOrder() );

		for (int n : numeros) {
			System.out.println (n);
		}

		int n1 [] = new int [3];

		for (int i = 2; i >= 0; i--) {
			n1 [i] = 3;
		}

		int n2 [] = new int [3];
		Arrays.fill (n2, 3);

		if (Arrays.equals (n1, n2))
			System.out.println ("\nOs arrays são iguais");

		n2 [2] = 9;

		if (Arrays.binarySearch (n2, 9) > 0)

			System.out.println ("O array n2 contém o número 9");


		List lista = Arrays.asList(numeros);

		System.out.println ("Valores da lista:");

		for (int i = 0; i < lista.size(); i++) 
			System.out.println (lista.get (i) + " "); 

	}
}
