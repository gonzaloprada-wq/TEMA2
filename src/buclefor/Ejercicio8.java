package buclefor;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//int para primer numero
		int numeroA;
		
		//int para segundo numero
		int numeroB;
		
		//int para la distancia
		int distancia=0;
		
		//creo escaner 
		Scanner reader = new Scanner(System.in);
		
		//pido que se ingrese a
		System.out.println("Ingresa A");
		
		//leo el numero
		numeroA = reader.nextInt();
		
		//pido que se ingrese b
		System.out.println("Ingresa B");
		
		//numerob lee hasta el siguiente int
		numeroB = reader.nextInt();
		
		//si a es mayor que b se cuenta desde b hasta a 
		if (numeroA>numeroB) {
			
			//un cotnador que empieze en el numerob hasta el a y que vaya de uno en uno
			for (int contador = numeroB; contador <= numeroA; contador++ ) {
				
				//Imprimo el numero
				System.out.print(contador+" ");
			};
			//lo mismo pero al reves
		} else if (numeroB>numeroA) {
			
			//Empieza en a hasta b y va de uno en uno
			for (int contador = numeroA; contador <= numeroB; contador++ ) {
				
				//imprime el numero
				System.out.print(contador+" ");};
			} else {System.out.println("Son Iguales");};
		
		//cierro el escaner
		reader.close();
}
}
