package dowhile;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numero = 1;

		if (0 == numero % 2) {

			System.out.println(numero);

			numero++;

		} else {
			numero++;
		}
		;

		do {
			if (0 == numero % 2) {

				System.out.println(numero);

				numero++;

			} else {
				numero++;
			}
			;

		} while (numero < 200);
		
}
}