package application;

import java.util.Locale;
import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantas alturas serão lidas:");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		double avg = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
			avg = sum / n;
		}

		System.out.printf("Average height: %.2f ", avg);

		sc.close();

	}

}
