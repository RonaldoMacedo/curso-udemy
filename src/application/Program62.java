package application;

import java.util.Scanner;

public class Program62 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int higher = max(n1, n2, n3);
		
		showResult(higher);
		
		sc.close();

	}
	
	public static int max(int n1, int n2, int n3) {
		int aux;
		if(n1 > n2 && n1 > n3) {
			aux = n1;
		}else if(n2 > n3) {
			aux = n2;
		}else {
			aux = n3;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}

}
