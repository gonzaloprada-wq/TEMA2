package loops;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * valor ingresado=2
		 * respùesta esperada=1
		 * respuesta dada=1.4
		 * 
		 *valor ingresado=-3
		 * respùesta esperada=0
		 * respuesta dada=0
		 * 
		 * */
		
		// Creo un int para numero
		double numero = 0;

		// otro para suma
		double suma = 0;

		// otro para media
		double media = 0;

		// creo un escaner
		Scanner reader = new Scanner(System.in);

		// leo el numero
		numero = reader.nextInt();

		// Creo un bucle que funciona si el numero es positivo o 0
		while (numero >= 0) {

			// Si es positivo si suma numero al total
			suma += numero;

			// Se añade 1 a la media
			media += 1;

			// Y leo el siguiente numero
			numero = reader.nextInt();
		}
		;

		// calculo la media
		suma = suma / media;

		// Imprimp resultado
		System.out.println("La suma es igual a: " + suma);

		// cierro el escaner
		reader.close();

	}
}
