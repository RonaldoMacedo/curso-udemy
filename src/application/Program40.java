package application;

import java.util.Locale;
import java.util.Scanner;

public class Program40 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		if(codigo == 1) {
			double total = quantidade * 4.0;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if(codigo == 2) {
			double total = quantidade * 4.5;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if(codigo == 3) {
			double total = quantidade * 5.0;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if(codigo == 4) {
			double total = quantidade * 2.0;
			System.out.printf("Total: R$ %.2f%n", total);
		}else {
			double total = quantidade * 1.5;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();

	}

}
