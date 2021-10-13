package br.com.condicionais;

import java.util.Scanner;

public class ExercicioPoligono {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numeroDeLados;
		
		System.out.println("Informe o número de lados do polígono: ");
		numeroDeLados = sc.nextInt();
		
		if (numeroDeLados < 3) {
			System.out.println("Não é um polígono!");
		} else if (numeroDeLados == 3) {
			System.out.println("É um Triângulo!");
		} else if (numeroDeLados == 4) {
			System.out.println("É um Quadrado!");
		} else if (numeroDeLados == 5) {
			System.out.println("É um Pentágono!");
		} else {
			System.out.println("Polígono não identificado!");
		}
		
		sc.close();
	}
}
