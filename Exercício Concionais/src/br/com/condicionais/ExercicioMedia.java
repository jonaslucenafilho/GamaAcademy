package br.com.condicionais;

import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		
		double media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
}
