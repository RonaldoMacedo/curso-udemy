package application;

import java.util.Locale;
import java.util.Scanner;

public class Program55 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			if(n2 == 0) {
				System.out.println("Divisão impossível");
			}else {
				double div = n1 / n2;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();

	}

}
