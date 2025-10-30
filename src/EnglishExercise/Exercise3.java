package EnglishExercise;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mirrorHour;
		int mirrorMin;

		int realHour = 0;
		int realMin = 0;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce the mirror hour");

		mirrorHour = reader.nextInt();

		System.out.println("Introduce the mirror minutoes");

		mirrorMin = reader.nextInt();

		mirrorHour = (mirrorHour == 12) ? 0 : mirrorHour;

		if (mirrorMin >= 60 || mirrorHour > 12) {
			System.out.println("ERROR");
		} else {

			if (mirrorMin == 0) {

				realHour = 12 - mirrorHour;

			} else {

				realHour = 11 - mirrorHour;

			}

			realMin = (60 - mirrorMin);

			System.out.println("LA HORA REAL ES:");

			realHour = (realHour == 0) ? 12 : realHour;

			if (realHour < 10) {

				System.out.print("0");
			}
			;

			System.out.print(realHour);
			System.out.print(":");
			if (realMin < 10) {

				System.out.print("0");
			}
			;

			System.out.print(realMin);

		}
		reader.close();
	}
}
