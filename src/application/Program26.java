package application;

import java.util.Locale;
import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou " + z);
		
		char a;
		a = sc.next().charAt(0);
		System.out.println("Você digitou " + a);
		
		String X;
		int Y;
		double Z;
		X = sc.next();
		Y = sc.nextInt();
		Z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
		
		sc.close();

	}

}
