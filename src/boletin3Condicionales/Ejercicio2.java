package boletin3Condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		//Creo un int para el numero
		int numero;
		
		//Creo un escaner
		Scanner reader = new Scanner(System.in);
		
		//Imprimo el mensaje para ingresar numero
		System.out.println("Ingrese su numero: ");
		
		//Leo el teclado para almacenar el numero
		numero = reader.nextInt();
		
		//Mediante un ternario paso de negativo a positivo en el caso de que sea negativo
		System.out.println("El valor absulto seria: " + (numero < 0 ? numero*(-1) : numero));
		
		//cierro el escaner
		reader.close();
		
}		
}
