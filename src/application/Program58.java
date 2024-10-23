package application;

import java.util.Scanner;

public class Program58 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int p = i;
			int q = i * i;
			int c = i * i * i;
			System.out.printf("%d %d %d%n", p, q, c);
		}
		
		sc.close();

	}

}
