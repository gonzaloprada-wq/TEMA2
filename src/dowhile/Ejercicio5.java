package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		String respuesta;
		int numeroAleatorio;
		int menor = 1;
		int mayor = 101;
		int correcto = 0;

		Random rand = new Random();

		Scanner reader = new Scanner(System.in);

		do {

			numeroAleatorio = rand.nextInt(menor, mayor);

			System.out.println("ES..? " + numeroAleatorio);

			respuesta = reader.next();

			if (respuesta.equals("MAYOR")) {

				menor = numeroAleatorio + 1;

			} else if (respuesta.equals("MENOR")) {

				mayor = numeroAleatorio - 1;

			} else if (respuesta.equals("IGUAL")) {

				System.out.println("Tu numero es: " + numeroAleatorio);

				correcto = 1;

			} else {
				System.out.println("ERROR");
			}

		} while (correcto == 0);

		reader.close();
	}
}
