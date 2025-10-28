package EnglishExercise;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		double yearMoney;
		
		char option;
		
		double porcentaje;
		
		double finalMoney;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Insert your money: ");
		
		yearMoney = reader.nextDouble();
		
		System.out.println("Select an interest option: ");
		System.out.println("A. 1.5");
		System.out.println("B. 2");
		System.out.println("C. 1.5");
		System.out.println("D. 5");
		
		option = reader.next().charAt(0);
		
		switch (option) {
		
		case 'A' , 'C' , 'a' , 'c' -> {porcentaje = 1.5;}
		
		case 'B' , 'b' -> {porcentaje = 2;}
		
		case 'D' , 'd' -> {porcentaje = 5;}
	
		default -> {porcentaje=0;}
		}
		if (porcentaje!=0) {
			
			finalMoney= yearMoney*porcentaje;
			System.out.println("Your final money is: "+finalMoney);
		} else {System.out.println("ERROR!");};
		
		reader.close();
		
		
}
}
