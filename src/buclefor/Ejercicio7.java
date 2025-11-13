package buclefor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		//Creo un double para primo
		double primo;
		
		//y un boolean
		boolean esPrimo = true;
		
		//creo un escaner
		Scanner reader = new Scanner(System.in);
		
		//pido ingresar numero
		System.out.print("Ingresa numero: ");
		
		//leo numero
		primo = reader.nextInt();
		
		//creo un for que lea el numero y cuente si es primo o no
		for (int contador=2; contador < primo; contador++) {
			
			//para ello calculo el rest de primo y contador y si alguno da cero no es primo
			if (primo%contador==0 ) {
				esPrimo=false;
			};
		};
		
		//Imprimo rsultado
		System.out.println("Es primo: " + esPrimo);
		
		//Cierro escaner
		reader.close();
}
}