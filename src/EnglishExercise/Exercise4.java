package EnglishExercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int precioTotal;

		int precioPagado;

		int resto; 
		
		int vuelta;
		
		int euros2=200;
		
		int euros1=100;
		
		int cent50=50;
		
		int cent20=20;
		
		int cent10=10;
		
		int cent5=5;
		
		int cent2=2;
		
		int cent1=1;
		
		
		Scanner reader = new Scanner(System.in);

		System.out.println("Ingresa precio total:");

		precioTotal = reader.nextInt();

		System.out.println("Ingresa precio pagado:");

		precioPagado = reader.nextInt();

		if (precioTotal > precioPagado) {
			
			System.out.println("Error");
			
		} else { 	
			
			resto = precioTotal-precioPagado; 
			
			if (resto < euros2) {
				
				euros2=resto/euros2;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println(euros2 +" "+ euros1 +" "+ cent50 +" "+ cent20 +" "+ cent10 +" "+ cent5 +" "+ cent2 +" "+ cent1);
		}	
		}
	}

