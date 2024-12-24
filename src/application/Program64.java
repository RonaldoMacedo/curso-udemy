package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program64 {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-12-24");
		LocalDateTime d05 = LocalDateTime.parse("2024-12-24T10:39:55");
		Instant d06 = Instant.parse("2024-12-24T10:39:55Z");
		Instant d07 = Instant.parse("2024-12-24T10:39:55-03:00");
		
		LocalDate d08 = LocalDate.parse("24/12/2024", fmt01);
		LocalDateTime d09 = LocalDateTime.parse("24/12/2024 10:49", fmt02);
		
		LocalDate d10 = LocalDate.of(2024, 12, 24);
		LocalDateTime d11 = LocalDateTime.of(2024, 12, 24, 10, 54);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);

	}

}
