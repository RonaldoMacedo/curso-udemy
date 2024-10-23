package application;

import java.util.Scanner;

public class Program56 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int result = n * (n - i);
			System.out.println(result);
		}
		
		sc.close();

	}

}
