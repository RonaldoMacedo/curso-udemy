package application;

import java.util.Locale;
import java.util.Scanner;

public class Program55 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double result = 0.0;
		
		for(int i = 0; i < n; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			result = n1 / n2;
			System.out.println(result);
		}
		
		sc.close();

	}

}
