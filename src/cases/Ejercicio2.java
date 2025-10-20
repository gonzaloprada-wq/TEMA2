package cases;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creo un escaner para almacenar los siguientes valores
		Scanner reader = new Scanner(System.in);

		// Creo un int donde almacenare la nota
		int dia;

		// Imprimo un mensaje pidiendo que se ingrese la nota
		System.out.println("Ingrese el dia de la semana en numero: ");

		// Leo la nota y almaceno el valor
		dia = reader.nextInt();

		// Creo un switch para imprimir un mensaje por cada dia
		switch (dia) {

		// Creo uno por cada dia de la semana 1, 2 ,3 etc Lunes, Martes, Miercoles etc
		case 1 -> System.out.println("Ese dia es Lunes");

		case 2 -> System.out.println("Ese dia es Martes");

		case 3 -> System.out.println("Ese dia es Miercoles");

		case 4 -> System.out.println("Ese dia es Jueves");

		case 5 -> System.out.println("Ese dia es Viernes");

		case 6 -> System.out.println("Ese dia es Sabado");

		case 7 -> System.out.println("Ese dia es Domingo");

		default -> System.out.println("Numero no valido");

		}
		// Cierro el escaner
		reader.close();

	}
}
