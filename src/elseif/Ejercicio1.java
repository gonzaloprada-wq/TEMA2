package elseif;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
	//Declaramos la variable.
	int numero;

	//Creo un escaner pa almacenar valores
	Scanner reader = new Scanner (System.in);
	
	//Realizamos la pregunta al usuario.
	System.out.println("Introduzca un número: ");
	
	numero = reader.nextInt();
	
	//Realizamos el condicional.
			if (numero % 2 == 0) {
					System.out.println("El número introducido es par.");
				}		 else {
						System.out.println("El número introducido es impar.");
					}
				
	//Cerramos el scanner.
	reader.close();
}
}