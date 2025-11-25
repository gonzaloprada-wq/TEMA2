package examenPrueba;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		int aux=0;
		
		int contPar=0;
		
		int contNoPar=0;
		
		Scanner reader = new Scanner (System.in);
		
		System.out.print("Ingresa numero: ");
		
		numero = reader.nextInt();
		
		aux=numero;
		
		do {
			
			
			if(aux%2==0){contPar++;}
			
			else {contNoPar++;}
			
			aux /=10;
			
		}while(aux!=0);
		
		if(numero==0) {contPar=0;}
		
		System.out.print("El numero: "+numero+" tiene "+contPar+ " par/es, y "+contNoPar+" impar/es");
		
		
	}

}
