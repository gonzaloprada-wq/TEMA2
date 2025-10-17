package elseif;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Creo un escaner para almacenar los siguientes valores
		Scanner reader = new Scanner(System.in);

		//Creo un int para el numero que ingresemos
		int numero;

		//Creo un mensaje para que ingreses un numero
		System.out.println("Ingrese su numero");

		//leo dicho numero
		numero = reader.nextInt();

		//Creo un if para determinar cuantas cifras tiene segun el rango de numeros en el que este
		if (numero < 10 && numero >= 0) {
			
			//Imprimimos esto si esta entre 0 y 9
			System.out.println("Tu numero tiene 1 cifra");
			
			
		} else if (numero < 100 && numero >= 10) {
			
			//Imprimimos esto si esta entre 100 y 10
			System.out.println("Tu numero tiene 2 cifras");
		}

		else if (numero < 1000 && numero >= 100) {
			
			//Imprimimos esto si esta entre 1000 y 100
			System.out.println("Tu numero tiene 3 cifras");
		}

		else if (numero < 10000 && numero >= 1000) {
			
			//Imprimimos esto si esta entre 10000 y 1000
			System.out.print("Tu numero tiene 4 cifras");
		}

		else if (numero <= 99999 && numero >= 10000) {
			
			//Imprimimos esto si esta entre 99999 y 10000
			System.out.println("Tu numero tiene 5 cifras");
		}
		
		else {
			//imprimimos esto en el caso de que no sea ninguno para el caso en el que el usuario ponga otro nombre
			System.out.println("ERROR");}
		
		//cierro el escaer
		reader.close();
	}
}
