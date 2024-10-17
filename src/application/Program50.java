package application;

import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (codigo != 4) {
			if(codigo == 1) {
				alcool += 1;
			}
			if(codigo == 2) {
				gasolina += 1;
			}
			if(codigo == 3) {
				diesel += 1;
			}else {
				codigo = sc.nextInt();
			}
		}
		
		System.out.println("Muito obrigado...");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
