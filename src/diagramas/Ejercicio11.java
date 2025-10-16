package diagramas;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		// Se crea un sring para el nombre del trabajador
		String nombre;

		// se crea un Int para el numero de horas
		int numHoras;

		// Creo un double para las tarifas de euros/hora
		double tarifaHoras;

		// creo un double para almacenar el salario bruto
		double salBruto;
		
		//Lo mismo para el neto
		double salNeto;

		//y otro para calcular las tasas
		double tasas;
		
		// Y un escaner para almacenar la informacion
		Scanner reader = new Scanner(System.in);
		
		// Creo un escaner que me pida el nombre
		System.out.print("Introduza el nombre del empleado: ");
		
		//lo leo
		nombre = reader.nextLine();

		// pido el numero de horas
		System.out.print("Introduzca el numero de horas: ");
		
		//Y loleo
		numHoras = reader.nextInt();
		
		//Pido la tarofa hora
		System.out.print("Introduce la tarifa horas: ");

		//Y lo leo
		tarifaHoras = reader.nextDouble();
		
		//Creo un if segun las horas si son mas o menos a 35
		if (numHoras <= 35) {
			
			//calculo una posibilidad (positiva)
			salBruto = tarifaHoras * numHoras;
		}
			//en el caso de que salga negattivo sale lo siguiente
		else {
			salBruto = 35 * tarifaHoras + ((numHoras - 35) * tarifaHoras * 1.5);
		}
		
			//Calculo el tramo 1 de impuestos
		if (salBruto <= 500) {
			//Y su solucion
			tasas = 0;
			
			//tramo 2
		} else if (salBruto <= 900) {

			tasas = (salBruto - 500) * 0.25;
			
			//calculo final
		} else {
			
			//calculo las tasass
			tasas = (400 * 0.25) + (salBruto - 900) * 0.45;
		}

		salNeto = salBruto - tasas;
		//Imprimo resultado
		System.out.println("SalNeto: " + salNeto);
		System.out.println("Tasas: " + tasas);

	}
}
