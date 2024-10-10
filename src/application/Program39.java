package application;

import java.util.Scanner;

public class Program39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		
		if(horaInicio > horaFim) {
			int duracao = 24 - horaInicio + horaFim;
			System.out.println("O jogo durou " + duracao + " horas");
		}else if(horaInicio < horaFim){
			int duracao = horaFim - horaInicio;
			System.out.println("O jogo durou " + duracao + " horas");
		}else {
			System.out.println("O jogo durou 24 horas");
		}
		
		sc.close();

	}

}
