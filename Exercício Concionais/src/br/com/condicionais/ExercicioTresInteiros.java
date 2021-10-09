package br.com.condicionais;

import java.util.Scanner;

public class ExercicioTresInteiros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int primeiroNumero = sc.nextInt();

		System.out.println("Informe o segundo número: ");
		int segundoNumero = sc.nextInt();

		System.out.println("Informe o terceiro número: ");
		int terceiroNumero = sc.nextInt();

		if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {		
			if (segundoNumero > terceiroNumero) {
				System.out.println("O maior número é: " + primeiroNumero);
				System.out.println("O menor número é: " + terceiroNumero);
			} else if (terceiroNumero > segundoNumero) {
				System.out.println("O maior número é: " + primeiroNumero);
				System.out.println("O menor número é: " + segundoNumero);
			} else {
				System.out.println("Os três números são iguais!");
			}
		} else if (segundoNumero >= terceiroNumero && segundoNumero >= primeiroNumero) {
			System.out.println("O maior número é: " + segundoNumero);
			if (primeiroNumero >= terceiroNumero) {
				System.out.println("O menor número é: " + terceiroNumero);
			} else {
				System.out.println("O menor número é: " + primeiroNumero);
			}
		} else {
			System.out.println("O maior número é: " + terceiroNumero);
			if (primeiroNumero >= segundoNumero) {
				System.out.println("O menor número é: " + segundoNumero);
			} else {
				System.out.println("O menor número é: " + primeiroNumero);
			}
		}

		sc.close();
	}
}
