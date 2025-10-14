package diagramas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Creo el escaner para almacenar los siguientes valores
		Scanner reader = new Scanner(System.in);

		//creo un double para almacenar cualquier tipo de valor decimal para hacer los calculos
		double numeroX;
		
		//creo un double para almacenar cualquier tipo de valor decimal para hacer los calculos
		double numeroY;

		//Aqui pido que introduzca el primer numero para el calculo
		System.out.print("Ingresa el primer numero: ");

		//Aqui leo el teclado para almacenarlo
		numeroX = reader.nextDouble();

		//Aqui pido que introduzca el segundo numero para el calculo
		System.out.print("Ingresa el segundo numero: ");

		//Aqui leo el teclado para almacenarlo
		numeroY = reader.nextDouble();
		
		//Aqui calculo la suma y lo paso a int
		System.out.println("SUMA: " + (int) (numeroX + numeroY));

		//Aqui calculo la suma y lo paso a int
		System.out.println("RESTA: " + (int) (numeroX - numeroY));

		//Aqui calculo la multiplicacion y lo paso a int
		System.out.println("PRODUCTO: " + (int) (numeroX * numeroY));

		//Aqui creo un if para darme dos resultados segun el valor de Y para la division
		if (numeroY <= 0) {
			//si es menor de 0 saldria un mensaje de error
			System.out.println("PRODUCTO: Syntaxis ERROR");}

		else {
			//En el caso de que no lo sea no habrai problema
			System.out.println("PRODUCTO: " + (numeroX / numeroY));}

		//Cierro el reader
		reader.close();
	}
}
