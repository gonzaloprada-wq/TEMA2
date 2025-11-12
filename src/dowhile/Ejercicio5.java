package dowhile;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int numeroAleatorio;
		int menor = 1;
		int mayor = 101;
		String mayorMenor;

		Random random = new Random();

		Scanner reader = new Scanner(System.in);

		do {

			numeroAleatorio = random.nextInt(menor, mayor + 1);

			System.out.println("El numero es: " + numeroAleatorio);

			mayorMenor = reader.next();

			if (mayorMenor.equals("MAYOR")) {

				menor = numeroAleatorio + 1;

			} else if (mayorMenor.equals("MENOR")) {

				mayor = numeroAleatorio - 1;

			} else if (mayorMenor.equals("IGUAL")) {

				System.out.println("Tu numero es " + numeroAleatorio);

			} else {

				System.out.println("ERROR, Introduce valor valido (MAYOR, MENOR o IGUAL)");
			}
			;

		} while (!mayorMenor.equals("IGUAL"));

		reader.close();

	}
}
