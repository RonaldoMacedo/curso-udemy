package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Pessoa;

public class Program12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão lidas?");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		int menor = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "° pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			if(idade > 16) {
				menor += 1;
			}
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
			media = soma / (i+1);
		}
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		System.out.println("Pessoas com menos de 16 anos: " + menor);
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
