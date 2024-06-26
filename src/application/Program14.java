package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Room;

public class Program14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
	
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i  + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			vect[room] = new Room(name, email);
			
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
