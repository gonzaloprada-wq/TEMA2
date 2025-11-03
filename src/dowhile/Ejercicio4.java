package dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numero;
		
		int multiplicacion=1;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingresa numero: ");
		
		numero = reader.nextInt();
		
		System.out.println();
		
		do{
			
		System.out.println(numero+"x"+multiplicacion+"="+(numero*multiplicacion));
			
		multiplicacion++;
			
		}while(multiplicacion<=10);
		
		
		reader.close();		

}	
}
