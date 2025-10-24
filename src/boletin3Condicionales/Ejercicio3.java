package boletin3Condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*
		 * valor ingresado=29587987
		 * respùesta esperada=M
		 * respuesta dada=M
		 * 
		 *valor ingresado=64645469
		 * respùesta esperada=J
		 * respuesta dada=J
		 * 
		 * */
		
		// Creo un int para el dni
		int dni;

		// Creo un in para determinar el numero de la tabla
		int numeroTabla;

		// Creo un char para dicha letra
		char letra = 0;

		// Creo un final int para darle un valor estatico
		final int NUMERO_TABLA = 23;

		// Creo un escaner para almacenar datos
		Scanner reader = new Scanner(System.in);

		// Imprimo una pregunta que pide el dni sin la letra
		System.out.println("Ingrese su DNI si su letra");

		// leo dicho numero
		dni = reader.nextInt();

		// Si el dni es incompatibel da error, en el caso de que lo sea ocurrira lo
		// siguiente
		if (dni <= 99999999 && dni > 9999999) {
			numeroTabla = dni % NUMERO_TABLA;

			// Segun el numero de entrara en una de las siguientes llaves convirtiendose en
			// una letra
			switch (numeroTabla) {

			case 0 -> letra = 'T';
			case 1 -> letra = 'R';
			case 2 -> letra = 'W';
			case 3 -> letra = 'A';
			case 4 -> letra = 'G';
			case 5 -> letra = 'M';
			case 6 -> letra = 'Y';
			case 7 -> letra = 'F';
			case 8 -> letra = 'P';
			case 9 -> letra = 'D';
			case 10 -> letra = 'X';
			case 11 -> letra = 'B';
			case 12 -> letra = 'N';
			case 13 -> letra = 'J';
			case 14 -> letra = 'Z';
			case 15 -> letra = 'S';
			case 16 -> letra = 'Q';
			case 17 -> letra = 'V';
			case 18 -> letra = 'H';
			case 19 -> letra = 'L';
			case 20 -> letra = 'C';
			case 21 -> letra = 'K';
			case 22 -> letra = 'E';
			}
			// imprimo resultado si esta bien
			System.out.println("Tu dni es: " + dni + "" + letra);

		} else {
			// imprimo el resultado que da error
			System.out.println("ERROR");
		}

	}
}
