package buclefor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Int para el numero
		int numero;
		
		//Escaner para leer el numero deseado
		Scanner reader = new Scanner(System.in);

		//Pido ingresar
		System.out.println("Ingresa numero: ");

		//leo el numero
		numero = reader.nextInt();

		//creo un for que empieze en el 1, que solo funcione hasta que el contador
		//sea mayor que numero, y que vaya de uno en uno
		for (int contador = 1; contador <= numero; contador++) {
			
			//creo un if - else para que no se imprima "+" si es el ultimo numero
			if (contador == numero) {
				System.out.print(contador+"");
			} else {
			System.out.print(contador+"+");
			};}
		
		//Cierro el reader
		reader.close();
	}}
	
