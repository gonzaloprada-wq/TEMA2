package diagramas;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// creo un escaner para el siguiente numero
		Scanner reader = new Scanner(System.in);

		// este es el int del numero que quiero encontrar
		int numero;

		// pongo un mensaje para leer el proximo numweo
		System.out.print("Introduce tu nota: ");

		// aqui leemos el teclado
		numero = reader.nextInt();

		//Creo un if para la primera tanda de notas y le pongo la respuesta
		if (numero < 3 && numero >= 0) {
			System.out.print("Muy deficiente");
		}
		//Creo un if para la segunda tanda de notas y le pongo la respuesta
		else if (numero < 5 && numero >= 3) {
			System.out.print("Insuficiente");
		}
		//Creo un if para la tercera tanda de notas y le pongo la respuesta
		else if (numero < 7 && numero >= 5) {
			System.out.print("Bien");
		}
		//Creo un if para la cuarta tanda de notas y le pongo la respuesta
		else if (numero < 9 && numero >= 7) {
			System.out.print("Notable");
		}
		//Creo un if para la quinta tanda de notas y le pongo la respuesta
		else if (numero <= 10 && numero >= 9) {
			System.out.print("Notable");
		}
	//cierro el escanerS
	reader.close();
}
}
