package elseif;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// Creo un double para el valor a
		int a;

		// Creo un double para el valor b
		int b;

		// Creo un double para el valor c
		int c;

		// Creo un double para el resultado de la suma
		double xMas;

		// Creo un double para el resultado de la resta
		double xMenos = 0;

		double discriminante;

		// Imprimo la pregunta para que ingrese el valor de a
		System.out.println("ingrese su numero a: ");

		// Aqui leemos a
		a = reader.nextInt();

		// Imprimo la pregunta para que ingrese el valor de b
		System.out.println("ingrese su numero b: ");

		// Aqui leemos b
		b = reader.nextInt();

		// Imprimo la pregunta para que ingrese el valor de c
		System.out.println("ingrese su numero c: ");

		// Aqui leemos c
		c = reader.nextInt();

		discriminante = b * b - 4 * a * c;

		// Aqui creamos un if para que en el caso de que alguno de que algunos de estos
		// numero no sean valores posibles de error
		if (a == 0) {
			//Aqui calculo conla posibilidad de que no exista a
			xMas = (double) -c / b;
			
			//E imprimo solucion
			System.out.println("La ecuacion tiene una sola solucion"+ xMas);

			//Aqui vemos si el discriminante es positivo para seguir con la solucion
		} else if (discriminante >= 0) {
			
			//Y aqui caculamos el +
			xMas = (-b + Math.sqrt(discriminante)) / (2 * a);
			
			//Y aqui caculamos el -
			xMenos = (-b - Math.sqrt(discriminante)) / (2 * a);
			
			//Imprimimos soluciones tanto del + como del -
			System.out.println("Solucion mas"+ xMas);
	
			System.out.println("Solucion menos"+ xMenos);
		}
		
		else {

			System.out.println("La ecuacion no tiene solucion");

		}
		reader.close();
}
}
