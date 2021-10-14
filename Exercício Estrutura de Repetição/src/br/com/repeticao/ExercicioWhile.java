package br.com.repeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDeNotas = 0;
		double somaNotas = 0;
		double notaInformada = 0;
		double media = 0;
		
		while(notaInformada != -1) {
			System.out.println("Digite uma nota entre 0 e 10: \nOu digite -1 para finalizar.");
			notaInformada = sc.nextDouble();
			
			if (notaInformada >= 0 && notaInformada <= 10) {
				somaNotas += notaInformada;
				numeroDeNotas++;
			} else if (notaInformada != -1) {
				System.out.println("Informe uma nota válida!");
			}
		}	
		
		media = somaNotas / numeroDeNotas;
		System.out.printf("A média dos " + numeroDeNotas + " alunos, foi %.2f\n", media);
		System.out.println("FIM");
		
		sc.close();
	}
}
