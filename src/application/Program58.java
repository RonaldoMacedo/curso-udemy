package application;

import java.util.Scanner;

public class Program58 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int q = i * i;
			int c = i * i * i;
			System.out.print(i + " ");
			System.out.println();
			System.out.print(q + " ");
			System.out.println();
			System.out.print(c + " ");
		}
		
		sc.close();

	}

}
