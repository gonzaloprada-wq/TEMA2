package bucles;

public class ejemplo {

	public static void main(String[] args) {

		int numero = 6;

		for (int linea = 1; linea <= numero; linea++) {      

		    for (int posicion = 1; posicion <= numero + linea - 1; posicion++) {  

		        if (posicion <= numero - linea) {
		            System.out.print(" ");  
		        } else if ((posicion - (numero - linea)) % 2 == 1) {
		            System.out.print("*");   
		        } else {
		            System.out.print(" ");   
		        }
		    }

		    System.out.println();
		}}}
