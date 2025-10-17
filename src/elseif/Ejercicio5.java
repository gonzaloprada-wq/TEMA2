package elseif;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creo un escaner para almacenar los siguientes valores
		Scanner reader = new Scanner(System.in);

		// Creo una constante para el resultado TIJERAS
		final String TIJERAS = "TIJERAS";

		// Creo una constante para el resultado PAPEL
		final String PAPEL = "PAPEL";

		// Creo una constante para el resultado PIEDRA
		final String PIEDRA = "PIEDRA";

		// Creo un string para almacenar el resultado que de el jugador 1
		String jugador1;

		// Creo un string para almacenar el resultado que de el jugador 2
		String jugador2;

		// Doy un aviso de la manera en la que se debe ingresar los valores
		System.out.println("Ingrese PIEDRA, PAPEL o TIJERAS");

		// Pido al jugador 1 que elija
		System.out.print("Jugador 1: ");

		//Leo dicho resultado
		jugador1 = reader.next();
		
		// Pido al jugador 2 que elija
		System.out.print("Jugador 2: ");
		
		//Leo dicho resultado
		jugador2 = reader.next();

		//Creo un if para cada caso en el que gane el jugador 2
		
		//En este caso que gane por Piedra
		if (jugador2.equals(PIEDRA) && jugador1.equals(TIJERAS)) {
			
			//Y aqui el resultado
			System.out.println("Gana jugador 2");
		}

		//En este otro por tijeras
		else if (jugador2.equals(TIJERAS) && jugador1.equals(PAPEL)) {
			
			//Y aqui el resultado
			System.out.println("Gana jugador 2");
		}

		//Y En este ultimo por papel
		else if (jugador2.equals(PAPEL) && jugador1.equals(PIEDRA)) {
			
			//Y aqui el resultado
			System.out.println("Gana jugador 2");
		}
		
		//Aqui en el caso de que esten empatados
		else if (jugador2.equals(jugador1)) {
			System.out.println("Empate");
		}

		else {
			//Y aqui en el caso de que gane el jugador 1 por descarte
			System.out.println("Gana jugador 1");
		}
	//cierro escaner
	reader.close();
}
}
