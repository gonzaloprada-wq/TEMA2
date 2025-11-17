package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

	//Creo un int par el numero
	int numeroBucle;

	//Creo escaner
	Scanner reader = new Scanner(System.in);
	
	//controlo que el valor sea del 1 al 20
	do {
	System.out.println("Ingresa numero del 1 al 20: ");
	
	numeroBucle = reader.nextInt();
	
	}while(numeroBucle>20);
	
	//Creo un for para poner los /n y sumar
	for (int i=1; i<=numeroBucle; i++) {
	
		//creo otro for para sumarle el valor a cada linea
		for(int j=1; j<=i; j++) {
			
		//imprimo numero
		System.out.print(i);	
	}
		//imprimo salto de linea
		System.out.print("\n");
	}
	//Cierro escaner
	reader.close();
	}
}
