package application;

import java.util.Locale;
import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		float areaTriangulo = a * c / 2;
		float areaCirculo = (float) (3.14159 * c * c);
		float areaTrapezio = (a + b) * c / 2;
		float areaQuadrado = b * b;
		float areaRetangulo = a * b;
		
		System.out.printf("Triângulo: %.3f%n", areaTriangulo);
		System.out.printf("Círculo: %.3f%n", areaCirculo);
		System.out.printf("Trapezio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retângulo: %.3f%n", areaRetangulo);
		
		sc.close();

	}

}
