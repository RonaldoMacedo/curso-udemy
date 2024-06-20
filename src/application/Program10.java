package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos produtos serão lidos:");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);			
		}
		
		double sum = 0.0;
		double avg = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
			avg = sum / n;
		}
		
		System.out.printf("Average price: %.2f", avg);
		
		sc.close();

	}

}
