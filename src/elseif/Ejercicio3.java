package elseif;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		double a;

		double b;

		double c;

		double xMas=0;
		
		double xMenos=0;

		System.out.println("ingrese su numero a: ");

		a = reader.nextDouble();

		System.out.println("ingrese su numero b: ");

		b = reader.nextDouble();

		System.out.println("ingrese su numero c: ");

		c = reader.nextDouble();

		if (a == 0 || b == 0 || c == 0) {
			System.out.println("No es posible realizar esta cuenta debido a que falta un valor");
		} else {xMas = (-b + Math.sqrt(b*b - 4*a*c))/(2*a); xMenos = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);}
		;
		System.out.println("La dos respuesta serian: ");
		System.out.print("(+)" + xMas);
		System.out.print("(-)" + xMenos);
		
}
}
