package boletin3Condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * valor ingresado=4554
		 * respùesta esperada=true
		 * respuesta dada=true
		 * 
		 *valor ingresado=44
		 * respùesta esperada=true
		 * respuesta dada=true
		 * 
		 * */
		//Creo un int con el nombre de numero
		int numero;

		//creo otro para las primeras cifras del numero
		int cifrasPrincipio = 0;

		//creo otro para las finales
		int cifrasFinal = 0;

		boolean capicua;
		
		//Creo un scanner 
		Scanner reader = new Scanner(System.in);

		//Imprimo un mensaje el cual me pida un numero
		System.out.print("Ingrese su numero comprendido entre 0 - 9999: ");

		//Almaceno dicho numero
		numero = reader.nextInt();

		//Creo un if para cada opcion en esta opcion de una cifra
		if (numero >= 0 && numero <= 9) {

			//como todas las que son de una cifra son capicua infreso lo siguienrte
			capicua = true;
			
		//detecto si esta en el rango deseado
		} else if (numero >= 10 && numero <= 99) {

			//realizo las cuentas para sacarle las cifras deseadas y compararlas
			cifrasPrincipio = numero / 10;

			cifrasFinal = numero % 10;
			
			//detecto si esta en el rango deseado
		} else if (numero >= 100 && numero <= 999) {
			//realizo las cuentas para sacarle las cifras deseadas y compararlas
			cifrasPrincipio = numero / 100;

			cifrasFinal = numero % 10;

			//detecto si esta en el rango deseado
		} else if (numero >= 1000 && numero <= 9999) {

			//realizo las cuentas para sacarle las cifras deseadas y compararlas
			cifrasPrincipio = numero / 100;

			cifrasFinal = numero % 100;

			//Invierto las cifras finales con esta operación.
			cifrasFinal = ((cifrasFinal % 10) * 10) + (cifrasFinal / 10);

			//En el caso de que no este entre ese rango de de cifras saldra este error
		} else {
			System.out.println("ERROR, VALOR INTRODUCIDO NO VALIDO");
		}

			//Si las dos cifras que hemos calculado son iguales sera capicua
		if (cifrasFinal == cifrasPrincipio) {
			capicua=true;
			
			//En lo contrario no lo es
		} else {
			capicua=false;
		}
		
		System.out.println("Es capicua?: "+ capicua);
		//Cierro el e
		reader.close();
	}
}
