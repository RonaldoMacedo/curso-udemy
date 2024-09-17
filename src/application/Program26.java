package application;

import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println();
		int x;
		String s4, s5, s6;

		x = sc.nextInt();
		sc.nextLine(); //limpando o buffer de leitura - consumindo quebra de linha pendente
		s4 = sc.nextLine();
		s5 = sc.nextLine();
		s6 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

		sc.close();

	}

}
