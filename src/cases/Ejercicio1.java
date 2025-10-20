package cases;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creo un escaner para almacenar los siguientes valores
		Scanner reader = new Scanner(System.in);

		// Creo un int donde almacenare la nota
		int nota;

		// Imprimo un mensaje pidiendo que se ingrese la nota
		System.out.println("Ingrese su nota: ");

		// Leo la nota y almaceno el valor
		nota = reader.nextInt();

		// Un switch para darle un mensaje a cada nota
		switch (nota) {

		// caso que imprime el mensaje "insuficiente" si la nota esta entre 0 y 4
		case 0, 1, 3, 4 -> System.out.println("Insuficiente");

		// Caso que imprime "suficiente" si la nota es 6
		case 5 -> System.out.println("Suficiente");

		// Imprime bien si la nota es 6
		case 6 -> System.out.println("Bien");

		// Imprime notable si la nota es 7 o 8
		case 7, 8 -> System.out.println("Notable");

		// Imprime Sobresaliente si la nota es 7 o 8
		case 9, 10 -> System.out.println("Sobresaliente");

		// Si la nota no es ninguna imprimira lo siguiente
		default -> System.out.println("Nota no valida");

		}
		;
		// cierro el escaner
		reader.close();

	}
}
