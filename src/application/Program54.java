package application;

import java.util.Locale;
import java.util.Scanner;

public class Program54 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double media = 0.0;
		
		for(int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			media = (a * 2.0 +  b * 3.0 + c * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
