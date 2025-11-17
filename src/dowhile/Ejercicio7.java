
package dowhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		String menu;

		double numero1;

		double numero2;

		Scanner reader = new Scanner(System.in);

		do {
			System.out.println("Ingresa primer numero:");

			numero1 = reader.nextDouble();

			System.out.println("Ingresa segundo numero:");

			numero2 = reader.nextDouble();

			System.out.println("A. SUMAR LOS NÚMEROS");

			System.out.println("B. RESTAR LOS NÚMEROS");

			System.out.println("C. MULTIPLICAR LOS NÚMEROS");

			System.out.println("D. DIVIDIR LOS NÚMEROS");

			System.out.println("E. SALIR");

			menu = reader.next();
		

		} while (menu.equals("E")||(menu.equals("D")&& numero2==0));

		switch (menu) {

		case "A", "a" -> {
			System.out.println(numero1 + "+" + numero2 + "=" + (numero1 + numero2));
		}

		case "B", "b" -> {
			System.out.println(numero1 + "-" + numero2 + "=" + (numero1 - numero2));
		}

		case "C", "c" -> {
			System.out.println(numero1 + "x" + numero2 + "=" + (numero1 * numero2));
		}

		case "D", "d" -> {
			System.out.println(numero1 + "/" + numero2 + "=" + ((double) numero1 / numero2));
		}

		}
		reader.close();
	}
}

