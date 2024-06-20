package application;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão lidos?");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Números negativos encontrados:");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
		
	}

}
