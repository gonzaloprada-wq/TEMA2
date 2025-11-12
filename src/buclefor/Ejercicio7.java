package buclefor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		double primo;
		
		boolean esPrimo = true;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingresa numero: ");
		
		primo = reader.nextInt();
		
		for (int contador=2; contador < primo; contador++) {
			
			if (primo%contador==0 ) {
				esPrimo=false;
			};
		};
		
		System.out.println("Es primo: " + esPrimo);
		
		reader.close();
}
}