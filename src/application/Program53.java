package application;

import java.util.Scanner;

public class Program53 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x <= 20 && x >= 10) {
				in = in + 1;
			}else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
