package buclefor;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		int numero;
		
		int numeroAux;
		
		int contador=0;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingresa numero mayor que 0:");
		
		numero = reader.nextInt();
			
		numeroAux=numero;
		
		while (numeroAux>0) {
			numeroAux /= 10;
			contador++;	
		};
		
		System.out.println("Tiene "+contador);
		
		reader.close();
	}
}
