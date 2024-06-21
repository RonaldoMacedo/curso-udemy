package application;

import java.util.Locale;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão lidos?");
		int n = sc.nextInt();
		
		int vect[] = new int[n];
		
		int pares = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				pares += 1;
			}
		}
		
		System.out.println();
		System.out.println("Números pares encontrados:");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
			}
		}
		
		System.out.println();
		System.out.print("Quantidade de pares: " + pares);
		
		sc.close();

	}

}
