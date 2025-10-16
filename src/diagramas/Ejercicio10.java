package diagramas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int horas; 
		
		int minutos; 
		
		int segundos;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Instroduza horas");
		
		horas = reader.nextInt();
		
		System.out.println("Introduzca minutos");
		
		minutos = reader.nextInt();
		
		System.out.print("Introduzca segundos");
		
		segundos = reader.nextInt();
		
		if (segundos < 59){segundos++;}
		
		else {segundos = 0; if (minutos<59) {minutos++;}
		
		else {minutos = 0; horas++;}}
		
		System.out.println("tendriamos: " + horas + ":" +minutos+":"+segundos);

}
}
