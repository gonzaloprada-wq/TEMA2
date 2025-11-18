package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int contfallos;

		int num = 1;

		int otro = 1;

		Scanner reader = new Scanner(System.in);

		System.out.println("Dime un numero inical: ");

		num = reader.nextInt();
		do {
			do {
				otro = num;
				System.out.println("Dime un numero: ");

				num = reader.nextInt();

			} while (num > otro);
			
			if ( num!= 0) {
				System.out.println("Error");
			}

		} while (num != 0);

		System.out.println("Eerere");
	}
}
