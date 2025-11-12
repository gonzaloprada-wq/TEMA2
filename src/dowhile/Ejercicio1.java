package dowhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Creo un int con el numero uno para empezar la cadena de nuemeros
		int numero=1;
		
		//Creo un syso que indica los numero
		System.out.println("DEL 1 AL 20: ");
				
		//Creamos do-while para la cadena
		do {
		
		//Imprimo el primer numero
		System.out.println(numero);		
		
		//Le añado un numero a este
		numero++;
			
		//empieza de neuvo hasta que llegue a 20
		} while (numero<=20);
		
}
}
