package loops;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * valor ingresado=6 4 2 1 -3
		 * respùesta esperada=4
		 * respuesta dada=4
		 * 
		 *valor ingresado=-3
		 * respùesta esperada=0
		 * respuesta dada=0
		 * 
		 * */
	
		// Creo un int con el valor 0 para añadirle luego valores
		int numero = 0;

		// Creo un int con el valor 0 para añadirle luego valores
		int suma = 0;

		// Crear un escaner
		Scanner reader = new Scanner(System.in);

		// Leeo un número
		numero = reader.nextInt();

		// Creo un while y en el añado lo siguiente
		while (numero >= 0) {

			// cada vez que vuevle a empezar se le añade 1
			suma += 1;

			//leo el numero y si es mayor o igual que 0 vuelvo a empezar
			numero = reader.nextInt();
		}
		;

		//Imprimo el resultado
		System.out.println("La suma es igual a: " + suma);

		reader.close();
	}
}
