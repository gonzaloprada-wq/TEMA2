package cases;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creo un escaner para leer valores del teclado
		Scanner reader = new Scanner(System.in);

		// Creo un int para el primero numero
		int numero1;

		// Creo un int para el segundo numero
		int numero2;

		// Creo un char para la letra
		char letra;

		// Imprimo un mensaje que me pido que ingrese un primero numero
		System.out.print("Ingrese el primer numero: ");

		// Aqui lo leo
		numero1 = reader.nextInt();

		// Imprimo un mensaje que pide el segundo
		System.out.print("Ingresa el segundo numero: ");

		// Y leo el numero2
		numero2 = reader.nextInt();

		// Imprimo un mensaje que me indica las opciones que tengo a la hora de realizar
		// las operaciones
		System.out.println();
		System.out.println("A. SUMAR LOS NÚMEROS ");
		System.out.println("B. RESTAR LOS NÚMEROS ");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS ");
		System.out.println("D. DIVIDIR LOS NÚMEROS ");

		// Leo la letra que indica
		letra = reader.next().charAt(0);

		// aqui creo un switch para cada letra anterior
		switch (letra) {

		// En la a suma
		case 'A', 'a' -> System.out.println("Suma: " + (numero1 + numero2));

		// En la b resta
		case 'B', 'b' -> System.out.println("Resta: " + (numero1 - numero2));

		// en la c multiplica
		case 'C', 'c' -> System.out.println("Multiplicacion: " + numero1 * numero2);

		// en la d divide (creo un if en el caso de que sea 0 para que no de error)
		case 'D', 'd' -> {if (numero2>0) {System.out.print("Division: " + ((double) numero1 / numero2));}
		else{System.out.println("ERROR SYNTAXIS");}}

		// Creo un mensaje de error en el caso de que no ingrese ninguno de esos numeros
		default -> System.out.println("Valor no valido");

		}

		// cierro el escaner
		reader.close();
	}
}
