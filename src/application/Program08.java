package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Program08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		
		System.out.println("Enter account number:");
		int n = sc.nextInt();
		System.out.println("Enter account holder:");
		String name = sc.next();
		System.out.println("Is there an initial deposit(y / n)?");
		char answer = sc.next().toLowerCase().charAt(0);
		
		if(answer == 'y') {
			System.out.println("Enter initial deposit value:");
			double inDeposit = sc.nextDouble();
			
			acc = new Account(n, name, inDeposit);
			System.out.println("Account data: " + acc);
		}
		else {
			acc = new Account(n, name);
			System.out.println("Account data: " + acc);
		}
		
		System.out.println("Enter a deposit value: ");
		double dep = sc.nextDouble();
		
		acc.deposit(dep);
		
		System.out.println();
		System.out.println("Updated account data: " + acc);
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		double wit = sc.nextDouble();
		
		acc.withdraw(wit);
		
		System.out.println();
		System.out.println("Updated account data: " + acc);
		
		sc.close();

	}

}
