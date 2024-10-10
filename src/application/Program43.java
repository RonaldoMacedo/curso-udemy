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
		}else if(salario <= 3000.0) {
			double imposto = (salario - 2000.0) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}else if(salario <= 4500.0) {
			double imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}else {
			double imposto = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();

	}

}
