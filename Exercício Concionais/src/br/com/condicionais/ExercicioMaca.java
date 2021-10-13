package br.com.condicionais;

import java.util.Scanner;

public class ExercicioMaca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDeMacas;
		double total;
		
		System.out.println("Quantas maçãs você comprou?");
		numeroDeMacas = sc.nextInt();
		
		if (numeroDeMacas <= 12) {
			total = numeroDeMacas * 0.30;
			System.out.printf("Total = %.2f", total);
		} else {
			total = numeroDeMacas * 0.25;
			System.out.printf("Total = %.2f", total);
		}
		
		sc.close();
	}
}
