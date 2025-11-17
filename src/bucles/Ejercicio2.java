
package bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int divisor;
		// creo numero
		int numeroN;

		// creo un contador de primos
		int cuantosPrimos = 0;

		// boleano
		boolean esPrimo;

		// creo escanner
		Scanner reader = new Scanner(System.in);

		// creo un do while par controlar el numero 1
		do {
			System.out.print("Ingresa numero : ");

			numeroN = reader.nextInt();
		} while (numeroN <= 1);

		// creo un for que funcione a partir del 2 que funcione hasta numero y que vaya
		// de uno en uno
		for (int i = 2; i <= numeroN; ++i) {

			divisor=2;
			
			// le doy valor a la boolean
			esPrimo = true;

		while (divisor<i && esPrimo) {
			
			if(i%divisor==0) {
				
			esPrimo = false;	
			
			}
			
			divisor++;
		}
			if (esPrimo) {
				cuantosPrimos++;
				
			};
			
		}
		// Imprimo resultado
		System.out.println("Hay " + cuantosPrimos + " numeros primos");

	}
}
