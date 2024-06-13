package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Aluno;

public class Program05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.next();
		System.out.println("Suas notas: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		double notaFinal = aluno.notaFinal();
		
		System.out.println();
		System.out.printf("Nota final: %.2f%n", notaFinal);
		
		aluno.teste(notaFinal);

	}

}
