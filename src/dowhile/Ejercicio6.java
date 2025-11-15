package dowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		String repetir;

		String jugador2;

		String jugador1;

		Scanner reader = new Scanner(System.in);

		do {

			System.out.print("INGRESA VALOR VALIDO J1: ");

			jugador1 = reader.nextLine();

		} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERAS"));

		do {

			System.out.print("INGRESA VALOR VALIDO J2: ");

			jugador2 = reader.nextLine();

		} while (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERAS"));
		
		if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERAS"))
			||(jugador1.equals("TIJERAS")&&jugador2.equals("PAPEL"))
			||(jugador1.equals("PAPEL")&&jugador2.equals("PIEDRA"))) 
		{
				System.out.println("Jugador 1 gana.");
				
			} else {System.out.println("Jugador 2 gana");}
		
		reader.close();
	}
}
