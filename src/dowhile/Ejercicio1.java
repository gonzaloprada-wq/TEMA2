package dowhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numero=1;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("DEL 1 AL 20: ");
				
		do {
		
		System.out.println(numero);		
		
		numero++;
			
		} while (numero<=20);
		
		reader.close();				
}
}
