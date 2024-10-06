package application;

import java.util.Locale;
import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadarado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadarado;
		
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f", preco);
		
		sc.close();

	}

}
