package elseif;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
	
	//aqui creo un double para el numero
	double numero;
	
	//y aqui creo el escaner
	Scanner reader = new Scanner(System.in);
	
	//aqui pido que se introduzca el numero
	System.out.println("Introduce tu numero: ");
	
	//Y aqui lo almaceno
	numero = reader.nextDouble();
	
	//Aqui analizado el numero y determino siu es un casi cero o no
	if (numero < 1 && numero > -1 && numero != 0) { 
		
		//Y aqui lo determino
		System.out.println("Es un numero casi cero");
	}
	
	//y aqui imprimo en el caso de quie no lo sea
	else { System.out.print("No es un numero casi cero");}
	
	//Cierro el escaner
	reader.close();
	

		
}
}
