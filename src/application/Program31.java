package application;

import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca = (a * b) - (c * d);
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();

	}

}