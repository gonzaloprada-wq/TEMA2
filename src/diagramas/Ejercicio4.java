package diagramas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		//Creo un scanner para almacenar los siguientes dos valores
		Scanner reader = new Scanner(System.in);

		//He creado un double para almacenar el primer numero que luego usaremos para comparar
		double primerNumero;

		//He creado un double para almacenar el segundo numero que luego usaremos para comparar
		double segundoNumero;
		
		//Aqui imprimo un mensaje que me sirve para pedir al usuario un numero
		System.out.print("Ingrese el primer numero: ");

		//Aqui leo dicho numero
		primerNumero = reader.nextDouble();
		
		//Aqui imprimo un mensaje que me sirve para pedir al usuario el otro numero
		System.out.print("Ingrese el segundo numero: ");

		//Aqui leo dicho numero
		segundoNumero = reader.nextDouble();

		//
		if (primerNumero > segundoNumero) {
			System.out.print("El mayor es: " + primerNumero);
		}

		else if (segundoNumero > primerNumero) {
			System.out.print("El mayor es:_+ segundoNumero;");
		}

		else {
			System.out.print("Los dos numeros son iguales");
		}

		reader.close();
	}
}
