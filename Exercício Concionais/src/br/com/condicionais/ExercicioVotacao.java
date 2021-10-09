package br.com.condicionais;

import java.time.LocalDate;
import java.util.Scanner;

public class ExercicioVotacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu nascimento: ");
		int anoNascimento = sc.nextInt();
		
		int anoAtual = LocalDate.now().getYear();
		
		if (anoAtual - anoNascimento >= 16 ) {
			System.out.println("Você pode votar!");
		} else if (anoAtual - anoNascimento <= 0) {
			System.out.println("Você nem nasceu ainda!");
		} else {
			System.out.println("Você não pode votar!");
		}
		
		sc.close();
	}
}
