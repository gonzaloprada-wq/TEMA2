package examenPrueba;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int lado;

		Scanner reader = new Scanner(System.in);

		System.out.print("Ingresa numero ");

		lado = reader.nextInt();

		for (int i = 1; i <= lado; i++) {

			if (i == lado || i == 1) {
				for (int j = 1; j <= lado; j++) {

					System.out.print("*");
				}
			}

			else {
				System.out.print("*");

				for (int j = 2; j < lado; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
