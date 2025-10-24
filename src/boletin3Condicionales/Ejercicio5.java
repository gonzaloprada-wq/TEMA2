package boletin3Condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * valor ingresado=562 y 23
		 * respùesta esperada=57.5
		 * respuesta dada=57.5
		 * 
		 *valor ingresado=2 800
		 * respùesta esperada=2000
		 * respuesta dada=2000
		 * 
		 * */
		// creo un final dpuble para el precio por km;
		final double PRECIO_KM = 2.5;

		// creo otro para los dias maximos hasta el desceuento
		final double DIAS_MAXIMO = 7;

		// creo una ultima para la distancia maxima sin descuento
		final double DISTANCIA_MAXIMA = 800;

		// creo un int para los dias
		int dias;

		// un double para los km
		double km;

		// y otro para ingresiar km*2,5
		double precioFinal;

		// Creo un escaner para almacenar datos
		Scanner reader = new Scanner(System.in);

		// imprimo un mensaje que me pida ingresar cuantos dias dura el viaje
		System.out.println("Ingresa dias de viaje: ");

		// Ingreso la cantidad de dias
		dias = reader.nextInt();

		// Creo un syso para la cantidad de km
		System.out.println("Ingresa km de viaje: ");

		// Leo cuantos km son
		km = reader.nextDouble();

		// calculo cuanto seria el precion final sin descuento
		precioFinal = km * PRECIO_KM;

		// Creo un if para las condiciones de dias y km
		if (dias > DIAS_MAXIMO && km > DISTANCIA_MAXIMA) {

			// si las comple le resto 30%
			System.out.println("Precio a pagar (con 30% descuento)" + (precioFinal * 0.7));
		} else {
			// si no simplemente lo imprimo
			System.out.println("Precio a pagar (sin descuento)" + precioFinal);
		}

		// cierro el escaner
		reader.close();

	}
}
