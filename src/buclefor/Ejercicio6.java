package buclefor;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int nota;
		
		boolean suspenso= false;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingresa notas: ");
		
		for (int contador=1; contador<=5; contador++) {
			
			nota = reader.nextInt();
			
			if (nota<5) {
				suspenso=true;
			};
		};
		
		System.out.println("Hay suspensos: " + suspenso);
		
		reader.close();
}
}
