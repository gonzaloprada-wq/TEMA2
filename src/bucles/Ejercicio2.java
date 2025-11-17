package bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numeroN;

		int cuantosPrimos = 0;

		boolean esPrimo;

		Scanner reader = new Scanner(System.in);

		do {
			System.out.print("Ingresa numero : ");

			numeroN = reader.nextInt();
		} while (numeroN <= 1);

		for (int i = 2; i <= numeroN; ++i) {

			esPrimo = true;

			for (int j = 2; j < i && esPrimo == true; ++j) {

				if (i % j == 0) {

					esPrimo = false;
				}

			}
			if (esPrimo) {
				cuantosPrimos++;
			}
			;

		}

		System.out.println(cuantosPrimos);

	}
}
