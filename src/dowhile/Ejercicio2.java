package dowhile;

public class Ejercicio2 {

	public static void main(String[] args) {

		//Creo un int con el primer numero
		int numero = 1;
		
		//Creo do
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