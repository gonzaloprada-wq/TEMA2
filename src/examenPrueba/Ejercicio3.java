package examenPrueba;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int largo;

		int aux;

		Scanner reader = new Scanner(System.in);

		System.out.print("Ingresa numero");

		largo = reader.nextInt();

		aux = largo;
		for (int i = 0; i <= largo; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" ");

			};
			
			for (int k = aux; k > 0; k--) {
				
				if (i==0) {System.out.print("* ");}
				
				else if (k==aux || k==0) {System.out.print("* ");}
				
				else if (k>1&&k<aux) {System.out.print("  ");}
				
				else {System.out.print("*");}
			}
			
			aux--;
			System.out.println();
		}	
};
}
