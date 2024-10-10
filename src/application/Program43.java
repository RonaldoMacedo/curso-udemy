package application;

import java.util.Locale;
import java.util.Scanner;

public class Program43 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if(salario <= 2000.0) {
			System.out.println("Isento");
		}else if(salario > 2000.01 && salario <= 3000.0) {
			double imposto = (1000.0 * 0.08) + (2.0 * 0.18);
			System.out.printf("%.2f%n", imposto);
		}else {
			System.out.println("28%");
		}
		
		sc.close();

	}

}
