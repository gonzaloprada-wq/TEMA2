
package bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// creo hora
		int hora;

		// creo minutos
		int minutos;

		// creo segundos
		int segundos;

		// creo segundos incrementados
		int segInc;

		// creo escaner
		Scanner reader = new Scanner(System.in);

		// Ingresa hora
		System.out.print("Ingresa Hora:");

		// leo hora
		hora = reader.nextInt();

		// creo un do para que solo se ingrese valores menores que 60
		do {
			System.out.print("Ingresa minutos: (menos de 60) ");

			minutos = reader.nextInt();
		} while (minutos >= 60);

		// lo mismo para segundos
		do {
			System.out.print("Ingresa segundos: (menos de 60) ");

			segundos = reader.nextInt();
		} while (segundos >= 60);

		// Pido que ingrese segundos que pasan
		System.out.print("Ingresa segundos que pasa:");

		// Lo leo
		segInc = reader.nextInt();

		// creo un bucle que vaya del incremento a 0
		for (int i = segInc; i > 0; i--) {

			// incremento segunso para que se incremente lo pedido
			segundos++;

			// Si segundos es mayor o igual a 60 pasa
			if (segundos >= 60) {
				segundos = 0;
				minutos++;

				// sumo el segundo dado a todo;
				if (minutos >= 60) {
					minutos = 0;
					hora++;
					if (hora >= 24) {
						hora = 0;
					}
				}
			}
		}
		;

		// imprimo resultado
		System.out.println(hora + ":" + minutos + ":" + segundos);

		// cierro escaner
		reader.close();

	}}



