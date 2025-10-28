package loops;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * valor ingresado=22 34 54 78 96 56 -2 respuesta esperada=96 respuesta dada=96
		 * 
		 * valor ingresado= 22 34 54 78 96 1023 1023 1022 -2 respuesta esperada= 1023
		 * respuesta dada=1023
		 * 
		 */
		// creo un double para la altura del arbol
		double alturaArbol;

		// Y otra para arbolMasAlto
		double arbolMasAlto = 0;

		// Creo un escaner
		Scanner reader = new Scanner(System.in);

		// leo altura de arbol
		alturaArbol = reader.nextDouble();

		// Creo un while que solo funciona si es mayor
		while (alturaArbol >= 0) {

			// Creo un if para la altura de arbol si es mayor a la mas alta se almacena
			if (alturaArbol > arbolMasAlto) {
				arbolMasAlto = alturaArbol;
			}
			// leo el proximo arbol
			alturaArbol = reader.nextDouble();
		}
		;
		if (arbolMasAlto <= 0) {
			// Imprimo el resultado
			System.out.println("Introduce altura validad");
		} else {System.out.println("Arbol más alto: "+arbolMasAlto);}

		// Cierro escaner
		reader.close();
	}

}
