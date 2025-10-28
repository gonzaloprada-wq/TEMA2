package loops;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * valor ingresado=3 2 1 2 3 0 0 -4 3 -4
		 * respùesta esperada=14 2 -4
		 * respuesta dada=14 2 -4
		 * 
		 *valor ingresado=
		 * respùesta esperada=
		 * respuesta dada=
		 * 
		 * */
		// Creo un int para numeros positivos
		int positivo = 0;

		// Creo un int para numero cero
		int cero = 0;

		// Creo otro para numero negativo
		double negativo = 0;

		// Creo otro para numeros en general
		int numero;

		// otro para la media del negativo
		int mediaNegativo = 0;

		// Y otro para calcular las veces que se ha hecho un buelve
		int bucle = 0;

		// Creo un escaner
		Scanner reader = new Scanner(System.in);

		// Escaneo el numero

		// Creo un bucle que funciona si se ha hecho bucle 9 veces o menos
		while (bucle < 10) {

			numero = reader.nextInt();

			// Creo un if para el caso de que el numero sea positivo
			if (numero >= 1) {

				positivo += numero;

				// Otro para negativod
			} else if (numero < 0) {
				negativo += numero;

				mediaNegativo++;

				// Y otro para cero
			} else {
				cero++;
			}
			// Añado un uno al bucle para realizar el conteo
			bucle++;
		}
		;
		
		//creo un if para el caso en el que no haya ningun negativo, no de error
		if (negativo != 0) {
			negativo = negativo / mediaNegativo;
		}
		;
		
		//imprimo resutlado
		System.out.println("Positivo: " + positivo + " " + "Cero: " + cero + " Negativo: " + negativo);

		//Cierro escaner
		reader.close();
	}
}
