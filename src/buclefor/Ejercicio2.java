package buclefor;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creo int numero
		int numero;

		// Creo contador de Num
		int contNum = 0;

		// Scanner nuevo
		Scanner reader = new Scanner(System.in);

		// Pido ingresar numero
		System.out.println("Ingrese numero: ");

		// Leo el numero
		numero = reader.nextInt();

		// Contador empieza en 1, solo funciona si contador es menor o igual a numero, y
		// va
		// de uno en uno
		for (int contador = 1; contador <= numero; contador++) {

			// creo un if para solo darle valor a contNum si es divisible de 3
			if (contador % 3 == 0) {
				contNum++;
			}
		}
		;

		// Imprimo respuesta
		System.out.print("Hay " + contNum + " multiplos de 3");

		// Cierro reader
		reader.close();
	}
}
