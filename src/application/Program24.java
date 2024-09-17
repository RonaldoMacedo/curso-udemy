package application;

import java.util.Locale;

public class Program24 {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais %n", nome, idade, renda);
		
		System.out.println();
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f %n", product1, price1);
		System.out.printf("%s, which price is $%.2f %n", product2, price2);
		System.out.println();
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n" , measure);
		System.out.printf("Measue with eight decimal places: %.3f%n" , measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
