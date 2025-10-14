package diagramas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		//Creo un escaner para el siguiente valor
		Scanner reader = new Scanner(System.in);

		//Almaceno un valor vacio llamado double para darle valor
		double numero;

		//Imprimo un mensaje pidiendo un numero
		System.out.print("Ingresa el numero: ");

		//leo dicho numero
		numero = reader.nextDouble();

		//Creo un if para determinar si es mayor que 0, para que sea positivo
		if (numero > 0) {
			System.out.print("El numero es positivo");
		}
		//En el caso de que no lo sea imprimira lo siguiente
		else {
			System.out.print("El numero es negativo");
		}
		//Cierro escaner
		reader.close();
}
}
