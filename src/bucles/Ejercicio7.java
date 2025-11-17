package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int numero;

		Scanner reader = new Scanner(System.in);

		System.out.print("Ingresa numero ");

		numero = reader.nextInt();

		for (int i = 1; i <= numero; i++) {

			for (int k = 1; k <= i; k++) {

				System.out.print(k);
				
			}
			for (int k = i-1; k >=1; k--) {
			
			System.out.print(k);
			}
		System.out.println();
		
	}
		reader.close();
  }
}
