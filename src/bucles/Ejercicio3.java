package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//creo un int numero A.
		int numeroA;
	
		//creo un int numero B.
		int numeroB;

		//creo int.
		int mcm = 0;

		//creo int para el menor.
		int elMayor;

		//Creo un escaner.
		Scanner reader = new Scanner(System.in);

		//Imprimo mensaje.
		System.out.println("Ingresa a:");

		//Numero a es hasta next Int.
		numeroA = reader.nextInt();

		//Imprimo mensaje.
		System.out.println("Ingresa b:");

		//Numero a es hasta next Int.
		numeroB = reader.nextInt();

		//Doy el valor a el menor.
		elMayor = Math.max(numeroA, numeroB);

		//Creo un do 
		do {
			
			//Creo si numero A entre el menor da de resto 0 se da lo siguiente.
			if (numeroA % elMayor == 0) {

				//si eso ocurre se hace lo siguiente.
				if (numeroB % elMayor == 0) {

					mcm = elMayor;
				}
			}
					
			//resto a el menor.
			elMayor--;
		//Solo funciona mientras mcm sea 0.
		} while (mcm == 0);

		//Impromo resultado.
		System.out.println("El numero es " + mcm);
		
		//Cierro escaner.
		reader.close();
	}
}
	