package bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    	
    	int numero;
    	
        Scanner reader  = new Scanner(System.in);
        
        System.out.print("Introduce un número n: ");

        numero = reader.nextInt();
        
        for (int i = 1; i<=numero; i++) {
        	
        	for(int j = 1; j<= numero-i; j++) {
        		System.out.print(" ");}
        			
        	for (int k = 1; k<=i; k++) {
        		System.out.print("* ");
        		}
        	
        	System.out.print("\n");
        }
        reader.close();
    }	
}