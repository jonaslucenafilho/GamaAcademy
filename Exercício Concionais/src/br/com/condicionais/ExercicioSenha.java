package br.com.condicionais;

import java.util.Scanner;

public class ExercicioSenha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 1234;
		
		System.out.println("Digite a senha de acesso: ");
		int senhaDigitada = sc.nextInt();
		
		if (senha == senhaDigitada) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		
		sc.close();
	}
}
