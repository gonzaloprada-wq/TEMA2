package elseif;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int numero;

		System.out.println("Ingrese su numero: ");

		numero = reader.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Es par");
		}

		else {System.out.println("Es impar");}
		
		reader.close();
}	
}
