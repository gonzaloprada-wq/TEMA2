package diagramas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// He creado un int con el nombre de edad para almacenar su valor
		// correspondiente
		int edad;
		// He creado el scanner con nombre de reader para leer dicho valor (edad del
		// usuario)
		Scanner reader = new Scanner(System.in);

		// El sistema pregunta la edad del usuario
		System.out.print("Introduce su edad: ");

		// Tras esto empiezo a leer la edad del usuario
		edad = reader.nextInt();

		// Aqui con un if comparo la edad con 18
		if (edad >= 18) {

			/*
			 * Tras esto pongo que a la hora de comparar la edad si es mayor o igual a 18
			 * este imprime el siguiente mensaje
			 */
			System.out.print("Eres mayor de edad");
		}

		// Aqui cierro el scanner
		reader.close();

	}
}
