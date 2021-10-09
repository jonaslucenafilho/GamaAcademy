package br.com.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.printf("Aprovado com Distinção, média %.2f", media);
		} else if (media >= 7) {
			System.out.printf("Aprovado com média %.2f", media);
		} else {
			System.out.printf("Reprovado com média %.2f", media);
		}
				
		sc.close();
	}
}
