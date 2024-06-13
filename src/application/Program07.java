package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		System.out.println(String .format("%.2f", CurrencyConverter.DOLAR_PRICE));
		System.out.print("How many dollars will be bought? ");
		double dolar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais: R$" + CurrencyConverter.calcReal(dolar));
		
		sc.close();
		
	}

}
