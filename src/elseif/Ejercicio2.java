package elseif;

import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
				
	//creo un double llamado numero
		double numero;
		
	//Creamosun escaner para almacenar valores
	Scanner reader = new Scanner (System.in);
	
	//Imprimimos la pregunta .
	System.out.println("Introduzca un numero: ");
		
		//Guardamos la informacion
		numero = reader.nextDouble();
		
		//HAcemos un if para.
		if (numero > -1 && numero < 1 && numero != 0) {
			System.out.println("es casi cero");
		} else {
			System.out.println("no es casi cero");
		}
		
		//Cerramos el scannner.
		reader.close();
}
}

