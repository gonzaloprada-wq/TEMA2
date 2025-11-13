package buclefor;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Creo un int para notas
		int nota; 
		
		//Creo un booleano para suspensos
		boolean suspenso= false;
		
		//Creo un escaner reader
		Scanner reader = new Scanner(System.in);
		
		//Pido que se ingresen las notas
		System.out.println("Ingresa notas: ");
		
		//creo un for que empieze en el uno hasta el 5 y que valla de 1 en 1
		for (int contador=1; contador<=5; contador++) {
			
			//leo la nota
			nota = reader.nextInt();
			//si es menos de 5 el booleano se vuelve true
			if (nota<5) {
				suspenso=true;
			};
		};
		
		//imprimo resultado
		System.out.println("Hay suspensos: " + suspenso);
		
		//cierro escaner
		reader.close();
}
}
