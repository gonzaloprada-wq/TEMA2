package boletin3Condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * valor ingresado=2007 y 4
		 * respùesta esperada=Tiene 30 dias y no es año bisiesto
		 * respuesta dada=Tiene 30 dias y no es año bisiesto
		 * 
		 *valor ingresado=2024 y 3
		 * respùesta esperada=Tiene 31 dias y es año bisiesto
		 * respuesta dada=Tiene 31 dias y es año bisiesto
		 * 
		 * */
		//creo un int para almacenar el año 
		int año;
		
		//final int para almacenar cuanto tengo que dividir para bisistesto
		final int DIVIDIR_BISIESTO = 4;
		
		//creo un int para el mes
		int mes;
		
		//creo el escaner para almacenar los datos
		Scanner reader = new Scanner(System.in);
		
		//imprimo un mensaje que nos pida ingresar el año
		System.out.println("Ingresa el año: ");
		
		//leo el teclado
		año = reader.nextInt();
		
		//lo mismo pero con el mes en numero
		System.out.println("Ingresa el mes (en numeros): ");
		 
		mes = reader.nextInt();
	
		//calculo si es bisiesto
		if (año % DIVIDIR_BISIESTO == 0) {
			//si es bisiesto da estos resultado (29 dias en feberero)
			switch (mes) {
			
			case 1, 3, 5, 7, 8, 10 , 12 -> {System.out.println("Tiene 31 dias y es año bisiesto");}
			
			case 2 -> {System.out.println("Tiene 29 dias y es año bisiesto");}
			
			case 4, 6, 9, 11 -> {System.out.println("Tiene 30 dias y es año bisiesto");}
			
			default -> {System.out.println("Error");}}
			}else {
				
				switch (mes) {
				
				//si no es bisiesto da estos resultados (28 dias en febrero)
				case 1, 3, 5, 7, 8, 10 , 12 -> {System.out.println("Tiene 31 dias y no es año bisiesto");}
				
				case 2 -> {System.out.println("Tiene 28 dias y no es año bisiesto");}
				
				case 4, 6, 9, 11 -> {System.out.println("Tiene 30 dias y no es año bisiesto");}
				default -> {System.out.println("Error");}}
			}
		//ciero escaner
		reader.close();
}	
}

