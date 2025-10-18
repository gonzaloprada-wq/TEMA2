package elseif;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
				
	//Un int para la edad
	int edad;
				
	//Creo un escaner para guardar los valores
	Scanner reader = new Scanner (System.in);
				

	//Ask the question and read the variable.
	System.out.println("Introduzca su edad: ");
	
	//Leo la edad
	edad = reader.nextInt();
				
				//Set the conditional.
				if (edad >= 18) {
					System.out.println("Eres mayor de edad.");
				}
				
				//Close the scanner
				reader.close();
}
}

