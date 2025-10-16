package elseif;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		//creo un scanner para almacenar los siguientes datos
		Scanner reader = new Scanner(System.in);

		//creo un numero el cual sera el que identificare 
		int numero;
			
		//aqui imprimire la solicitud
		System.out.println("Ingrese su numero: ");
		
		//y leo el teclado
		numero = reader.nextInt();

		//calculo el resto del numero para determinar si es par o impar
		if (numero % 2 == 0) {
		//imprimo mensaje
			System.out.println("Es par");
		}
		//Imprimop mensaje
		else {System.out.println("Es impar");}
		
		//cierro reader.
		reader.close();
}	
}
