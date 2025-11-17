package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

	int numeroBucle;

	Scanner reader = new Scanner(System.in);
	do {
	System.out.println("Ingresa numero del 1 al 20: ");
	
	numeroBucle = reader.nextInt();
	
	}while(numeroBucle>20);
	
	for (int i=1; i<=numeroBucle; i++) {
	
		for(int j=1; j<=i; j++) {
			
		System.out.print(i);	
	}
		System.out.print("\n");
	}
	reader.close();
	}
}
