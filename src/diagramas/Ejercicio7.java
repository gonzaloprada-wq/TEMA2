package diagramas;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Creo un scanner para almacenar los siguientes dos valores
		Scanner reader = new Scanner(System.in);

		//He creado un double para almacenar el primer numero que luego usaremos para comparar
		double primerNumero;

		//He creado un double para almacenar el segundo numero que luego usaremos para comparar
		double segundoNumero;
		
		//Aqui imprimo un mensaje que me sirve para pedir al usuario un numero
		System.out.print("Ingrese el primer numero: ");

		//Aqui leo dicho numero
		primerNumero = reader.nextDouble();
		
		//Aqui imprimo un mensaje que me sirve para pedir al usuario el otro numero
		System.out.print("Ingrese el segundo numero: ");

		//Aqui leo dicho numero
		segundoNumero = reader.nextDouble();

		//Aqui abro un IF para decidir si es mayor, menor o igual un numero del otro
		if (primerNumero > segundoNumero) { 
			
			//Esto se imprimiria en el caso de que el primer numero sea mayor.
			System.out.print("El mayor es: " + primerNumero);}
		
		//Aqui un else para justo lo contrario
		else if (segundoNumero > primerNumero) {
			
			//Esto se imprimiria en el caso de que el segundo numero sea mayor.
			System.out.print("El mayor es:_+ segundoNumero;");}
		
		//Aqui el else final para el caso de que sean iguales
		else {
			//Esto se imprimiria en el caso de que los dos numeros sean iguales.
			System.out.print("Los dos numeros son iguales");}
		//cierro escaner
		reader.close();
	}
}

