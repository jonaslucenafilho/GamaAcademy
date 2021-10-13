package br.com.condicionais;

import java.util.Scanner;

public class ExercicioTriangulos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int angulo1;
		int angulo2;
		int angulo3;
		int somaDosAngulos;
		
		System.out.println("Digite o primeiro ângulo do triângulo: ");
		angulo1 = sc.nextInt();
		
		System.out.println("Digite o segundo ângulo do triângulo: ");
		angulo2 = sc.nextInt();
		
		System.out.println("Digite o terceiro ângulo do triângulo: ");
		angulo3 = sc.nextInt();
		
		somaDosAngulos = angulo1 + angulo2 + angulo3;
		
		if(somaDosAngulos > 180) {
			System.out.println("Os ângulos informados não são de um triângulo!");
		} else if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.println("Triângulo Retângulo!");
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Triângulo Obtusângulo!");
		} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.println("Triângulo Acutângulo!");
		}
		
		sc.close();
	}
}
