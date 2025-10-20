package elseif;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Creo un escaner para almacenar los siguientes valores
		Scanner reader = new Scanner(System.in);

		//creo un in para almacenar el primer numero
		int numero1;

		//creo un int para almacenar el segundo numero
		int numero2;

		//Creo un intpara almacenar el tercer numero
		int numero3;

		//Pido que me ingrese el numero 1
		System.out.println("Inserte el primer numero: ");

		//Almaceno el valor
		numero1 = reader.nextInt();

		//Pido que me ingrese el numero 2
		System.out.println("Inserte el segundo numero: ");
		
		//Almaceno el valor
		numero2 = reader.nextInt();

		//Pido que me ingrese el numero 3
		System.out.println("Inserte el tercer numero: ");

		//Almaceno el valor
		numero3 = reader.nextInt();

		//Creo un if creando las posibilidades de los numeros para que en el caso de que la sume de lo mismo se imprima el resultado
		if ((numero1 + numero2 == numero3) || (numero1 + numero3 == numero2) || (numero2 + numero3 == numero1)) {
			
			//Este es el resultado en el caso de que sea verda
			System.out.println("Dos numero dan como resultado el otro");
			
			//Este caso da como resultado la solucion en negativo
		} else {System.out.println("Dos numero no dan como resultado el otro");}
		
		
		reader.close();
}
}
