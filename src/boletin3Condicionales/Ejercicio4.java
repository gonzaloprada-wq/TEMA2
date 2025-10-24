package boletin3Condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 * valor ingresado=4+15=16
		 * respùesta esperada=False
		 * respuesta dada=False
		 * 
		 *valor ingresado=1+76=77
		 * respùesta esperada=Correcto
		 * respuesta dada=Correcto
		 * 
		 * */
		
		// creo un double para la suma debido a que mathrandom solo acepta double
		int suma;

		//creo un double para el primer random y para el segundo random
		double numeroRandom1;

		double numeroRandom2;

		//creo un double para almacenar la respuesta
		double respuesta;

		//creo un escaner para almacenar datos
		Scanner reader = new Scanner(System.in);

		//creo un random 1 entre el 99 y 1
		numeroRandom1 = Math.random() * 99 + 1;
		
		//lo convierto en int
		numeroRandom1 = (int) numeroRandom1;

		//creo un random 1 entre el 99 y 1
		numeroRandom2 = Math.random() * 99 + 1;

		//lo convierto en int
		numeroRandom2 = (int) numeroRandom2;

		//almaceno la suma de estos dos 
		respuesta = numeroRandom1 + numeroRandom2;

		//Imprimo las preguntas con sus datos
		System.out.println("Primer numero: " + numeroRandom1);

		System.out.println("Primer numero: " + numeroRandom2);

		//Y pido la respuesta
		System.out.println("RESPUESTA: ");

		//leo la respuesta
		suma = reader.nextInt();

		//Si esta bien imprime correcto
		if (suma == respuesta) {
			System.out.println("CORRECTO");
			
			//si no imprime incorrecto
		} else {
			System.out.println("INCORRECTO");
		}

		//Cierro el escaner
		reader.close();

	}
}
