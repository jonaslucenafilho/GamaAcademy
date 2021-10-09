package br.com.condicionais;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");		
		int idade = sc.nextInt();
		
		System.out.println("Você está acompanhado? ");
		String acompanhado = sc.next();
		
		boolean isAcompanhado = false;
		if (acompanhado.toUpperCase().equals("SIM")) {
			isAcompanhado = true;
		}
		
		if (idade <= 18 && idade >= 1) { 
			if (isAcompanhado) {
				System.out.println("Apesar de não ser adulto, você pode entrar!");
			} else {
				System.out.println("Você ainda não é adulto!");
			}
		} else if (idade > 18 && idade <= 60){
			System.out.println("Você já é uma pessoa adulta, pode entrar!");
		} else {
			System.out.println("Vocé é da terceira idade, pode entrar!");
		}
		
		sc.close();
	}
}
