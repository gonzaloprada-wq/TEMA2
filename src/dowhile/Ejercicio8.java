package dowhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		String dado1;
		
		String dado2;
		
		int dado1n;
		
		int dado2n;
		
		Scanner reader = new Scanner(System.in);
		
		do {
		System.out.println("Ingresa primer numero (mayusculas)");
		
		dado1 = reader.next();
		
		switch (dado1) {
		
		case "UNO" -> {dado1n=1;}
		
		case "DOS" -> {dado1n=2;}
		
		case "TRES" -> {dado1n=3;}
		
		case "CUATRO" -> {dado1n=4;}
		
		case "CINCO" -> {dado1n=5;}
		
		case "SEIS" -> {dado1n=6;}
		
		default -> {dado1n=-1;}
		}
		
		} while (dado1n==-1);
		
		do {
			System.out.println("Ingresa segundo numero (mayusculas)");
			
			dado2 = reader.next();
			
			switch (dado2) {
			
			case "UNO" -> {dado2n=1;}
			
			case "DOS" -> {dado2n=2;}
			
			case "TRES" -> {dado2n=3;}
			
			case "CUATRO" -> {dado2n=4;}
			
			case "CINCO" -> {dado2n=5;}
			
			case "SESIS" -> {dado2n=6;}
			
			default -> {dado2n=-1;}
			}
			
			} while (dado2n==-1);
		
		System.out.println("La suma de los dados es: " + (dado1n + dado2n))
		;
		reader.close();
		
	}

}
