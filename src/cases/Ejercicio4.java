package cases;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		String primeraTirada;

		String segundaTirada;

		int primeraTiradaNum = 0;

		int segundaTiradaNum = 0;

		System.out.println("Ingresa la primera tirada: ");

		primeraTirada = reader.next();

		System.out.println("Ingresa la segunda tirada: ");

		segundaTirada = reader.next();
		
		

		switch (primeraTirada) {

		case "uno", "UNO", "Uno": {
			primeraTiradaNum = 1;
			break;
		}

		case "dos", "DOS", "Dos": {
			segundaTiradaNum = 2;
			break;
		}

		case "tres", "TRES", "Tres": {
			primeraTiradaNum = 3;
			break;
		}

		case "cuatro", "CUARTRO", "Cuatro": {
			primeraTiradaNum = 4;
			break;
		}

		case "cinco", "CINCO", "Cinco": {
			primeraTiradaNum = 5;

		}

		case "seis", "SEIS", "Seis":
			primeraTiradaNum = 6;
			break;

		default:
			System.out.println("Primer valor no valido");
		}
	
		System.out.println();
		
		switch (segundaTirada) {

		case "uno", "UNO", "Uno": {
			segundaTiradaNum = 1;
			break;
		}

		case "dos", "DOS", "Dos": {
			segundaTiradaNum = 2;
			break;
		}

		case "tres", "TRES", "Tres": {
			segundaTiradaNum = 3;
			break;
		}

		case "cuatro", "CUARTRO", "Cuatro": {
			segundaTiradaNum = 4;
			break;
		}

		case "cinco", "CINCO", "Cinco": {
			segundaTiradaNum = 5;
			break;
		}

		case "seis", "SEIS", "Seis":
			segundaTiradaNum = 6;
			break;

		default:
			System.out.println("Segundo valor no valido");
		}

		System.out.println("La suma es de: " + (primeraTiradaNum + segundaTiradaNum));
	}
}
