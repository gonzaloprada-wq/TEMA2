package diagramas;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creo un escaner para leer los siguientes numeros
		Scanner reader = new Scanner(System.in);

		// Creo un double para el primer numero
		double numero1;

		// Creo un double para el segundo numero
		double numero2;

		// Creo un double para el tercer numero
		double numero3;
		
		//Pido que se ingrese el primer numero 
		System.out.print("Ingrese primer numero: ");
		
		//Aqui se empieza a leer el numero1
		numero1 = reader.nextDouble();
		
		//Pido que se ingrese el segundo numero 
		System.out.print("Ingrese primer numero: ");
		
		//Aqui se empieza a leer el numero2
		numero2 = reader.nextDouble();
		
		//Pido que se ingrese el segundo numero 
		System.out.print("Ingrese primer numero: ");
		
		//Aqui se empieza a leer el numero3
		numero3 = reader.nextDouble();
		
		//Aqui empieza el if empezamos comparando el numero1
		if (numero1 > numero2 && numero2 > numero3) {
			
			//Si el numero1 es el mayor se imprimira lo siguiente
			System.out.print("El numero mayor es " + numero1);
			
			//comparamos el numero2
		} else if (numero2 > numero1 && numero1 > numero3) {
			//Si el numero2 es el mayor se imprimira lo siguiente
			System.out.print("El numero mayor es "+ numero2);}
		
			//Si el numero3 es el mayor se imprimira lo siguiente
		else {System.out.print("El numero mayor es "+ numero3);}
		
		//Cierro el escaner
		reader.close();}
}
