package loops;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * valor ingresado=3 -3 
		 * respùesta esperada0 3 1 
		 * respuesta dada=0 3 1
		 * 
		 * valor ingresado=3 4 2 19 23 -3 r
		 * espùesta esperada=2 10 5 
		 * respuesta dada=2 10
		 * 5
		 * 
		 */

		// Int total de edad para la media
		int totalDeEdad = 0;

		// int para elmacenar resultados
		double edad = 0;

		// Int para la cantidad de alumnos y la media
		int media = 0;

		// Int para la cantidad de alumnos que son mayor de edad
		int mayorDeEdad = 0;

		// Creo un escaner
		Scanner reader = new Scanner(System.in);

		// leo el teclado
		edad = reader.nextInt();

		// Creo un bucle para el caso de que
		while (edad > 0) {

			// sumo edad a total de edad
			totalDeEdad += edad;

			// le añado un valor a media
			media++;

			// creo un if para el caso de que sea mayor de edad
			if (edad >= 18) {

				mayorDeEdad++;
			}

			// Leo el siguinte numero
			edad = reader.nextInt();
		}

		//Calculo la media
		edad = (double) totalDeEdad / media;

		//Imprimo resultado
		System.out.println("Mayor de edad: " + mayorDeEdad + " Media de edad: " + edad + " Total de alumnos: " + media);

		//Cierro escaner.
		reader.close();

	}
}
