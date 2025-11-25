package examenPrueba;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int lado;
		
		int aux1;
		
		int aux2;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingresa numero: "); 
		
		lado = reader.nextInt();

		aux1=lado;
		
		aux2=lado-1;
		
		for (int i = 0; i < lado; i++) {
			
			for(int k = aux1; k>=0; k--) {
				System.out.print("1");
			}
			for(int h = 0; h<=aux2; h++) {
				System.out.print("*");
			}
			aux1--;
			
			aux2+=2;
			System.out.println();
		}
		
		for (int i = lado-1; i>0; i--) {
			
			for (int k = 3; k>0; k--) {
				System.out.print("1");
			}
			
		}
			
	}
}
