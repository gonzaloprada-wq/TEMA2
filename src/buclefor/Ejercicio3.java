package buclefor;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		//creo int numero
		int numero;
	
		//creo int para la suma
		int suma = 0;
		
		//creo double para la media
		final double MEDIA=10;
		
		//creo un int para el conteo para el mensaje final
		int contMensj=0;
		
		//creo un escaner
		Scanner reader = new Scanner(System.in);
		
		//abro un for que funciona desde el 1 hasta el 10 y va de uno en uno
		for (int contador=1; contador <= 10; contador++){
			
			//Abro un Syso para pedir que se ingrese un numero
			System.out.println("Ingrese numero "+(++contMensj)+" :");
			
			//leo el numero
			numero = reader.nextInt();
			
			//cada vez que pasa se le sumael numero
			suma+=numero;
			};
	
			System.out.print("La media es de " + ((double)(suma/MEDIA)));
			
		reader.close();
}
}
