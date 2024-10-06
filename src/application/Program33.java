package application;

import java.util.Locale;
import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int codigo2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = (qtd1 * valor1) + (qtd2 * valor2);
		System.out.printf("Valor a pagar: R$%.2f", total);
		
		
		sc.close();

	}

}
