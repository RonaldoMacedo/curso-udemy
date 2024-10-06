package application;

import java.util.Locale;
import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double total = horasTrabalhadas * valorHora;
		System.out.println("Number = " + numero);
		System.out.printf("Salary =  U$ %.2f", total);
		
		sc.close();

	}

}
