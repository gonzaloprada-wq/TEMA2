package dowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		String jugador1;

		String jugador2;

		Scanner reader = new Scanner(System.in);

		do {
			System.out.println("Jugador 1, introduce una opción valida (PIEDRA, PAPEL o TIJERAS)");

			jugador1 = reader.next();

		} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERAS"));

		do {
			System.out.println("Jugador 2, introduce una opción valida (PIEDRA, PAPEL o TIJERAS)");

			jugador2 = reader.next();

		} while (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERAS"));

		if ((jugador1.equals("PIEDRA") && (jugador2.equals("TIJERAS")))
				|| ((jugador1.equals("PAPEL")) && ((jugador2.equals("PIEDRA"))))
				|| ((jugador1.equals("TIJERAS")) && (jugador2.equals("PAPEL")))) {
			
			System.out.println("GANA EL JUGADOR 1");
			
		} else if (jugador1.equals(jugador2)) {

			System.out.println("EMPATE");
			
		} else {System.out.println("GANA EL JUGADOR 2");}
		
		reader.close();
	}
}
