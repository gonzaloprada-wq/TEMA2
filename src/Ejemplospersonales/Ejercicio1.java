package Ejemplospersonales;

public class Ejercicio1 {

	public static void main(String[] args) {

		int lado = 12;

		int mitad = lado / 2;

		int lnAs = mitad + 1;

		int aux;

		for (int i = 1; i <= mitad; i++) {

			for (int j = 0; j < lnAs - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		if (lado == 3)
			System.out.print("* *");
		else {

			for (int i = 1; i <= lado - 2; i++) {

				if (i == 1 || i == lado - 2 || i == lado / 2) {
					System.out.print("* ");
				}

				else {
					System.out.print(" ");
				}
			}
		}
		aux = mitad;
		for (int i = 1; i <= mitad; i++) {

			if (i == 1) {
				System.out.println();
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = aux; j >= 1; j--) {
				System.out.print("* ");

			}
			aux--;
			System.out.println();
		}
	}
}
