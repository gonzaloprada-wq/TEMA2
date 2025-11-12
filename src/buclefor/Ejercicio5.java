package buclefor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//creo un int para almacenr el factorial
		int factorial;

		//Creo otro para el numero
		int numero;

		//Creo otro para la solucion
		long solucion = 1;

		//creo ubn escanner	
		Scanner reader = new Scanner(System.in);

		//pido numero
		System.out.print("Ingrese su factorial: ");

		//lo leo
		numero = reader.nextInt();

		//paso ese numero a el int para poder calcular sin cabida a errores
		factorial = numero;

		//Creo un for que empieze en el uno hasta que sea el numero dado y que vaya de uno en uno
		for (int contador = 1; contador <= numero; contador++) {

			//imprimo numero
			System.out.print(factorial);

			//si no es uno se imprime x
			if (factorial != 1) {

				System.out.print(" x ");

			//si es 1 ponemos =
			} else if (factorial == 1) {
				System.out.print(" = ");}
		
			//le restamos al factorial uno
				;
		};
		
		//creo un for que empieze en el uno que funcione hasta que sea igual a numero, y va de uno en uno
		for (int contador = 1; contador <=numero; contador++)

			//almaceno multiplicacion del resultado
		{ solucion *= contador; };
		
		//imprimo resultado
		System.out.println(solucion);
		
		//cierro escaner
		reader.close();
	}
}
