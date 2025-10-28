package loops;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * valor ingresado=2 3 2 1 2 -2
		 * respùesta esperada= 10
		 * respuesta dada=10
		 * 
		 *valor ingresado=-2
		 * respùesta esperada=0
		 * respuesta dada=0
		 * 
		 * */
		// Creo un int con el valor 0
		int numero = 0;

		// creo otro int con el valor cero
		int suma = 0;

		// creo un escaner
		Scanner reader = new Scanner(System.in);

		// leo el teclado
		numero = reader.nextInt();

		// Creo un buecle que funciona si el numero es positivo o 0
		while (numero >= 0) {

			// En el caso de que sea positivo se le suma al valor suma
			suma += numero;

			// Y se vuelve a leer el numero
			numero = reader.nextInt();
		}
		;

		// Imprimo el resultado
		System.out.println("La suma es igual a: " + suma);

		// Cierro el reader
		reader.close();

	}
}
