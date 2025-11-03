package dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int suma=1;
		
		int numero;
			
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingresa numero: ");
		
		numero = reader.nextInt();
		
		do { System.out.print(suma+"+");
			
			suma++;
			
		} while(suma<numero);
		
		System.out.print(numero);
		
		reader.close();
		
}
}
