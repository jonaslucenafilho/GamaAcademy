package br.com.repeticao;

public class ExercicioForUm {

	public static void main(String[] args) {

		double salario[] = { 200.0, 30.0, 400.0, 50.0, 320.0, 400.0, 100.0, 1200.0, 1150.0, 800.0, 740.0, 400.0, 500.0,
				320.0, 500.0, 700.0, 40.0, 35.0, 15.0, 50.0 };
		int qtdFilho[] = { 1, 2, 4, 5, 6, 4, 2, 9, 6, 1, 2, 2, 5, 6, 3, 5, 5, 1, 5, 6 };
		double totalSalario = 0.0;
		int totalFilhos = 0;
		double maxSalario = 0.0;
		int salarioAteCem = 0;

		for (int i = 0; i < salario.length; i++) {
			totalSalario += salario[i];
			totalFilhos += qtdFilho[i];
			if (salario[i] > maxSalario) {
				maxSalario = salario[i];
			}
			if (salario[i] <= 100) {
				salarioAteCem++;
			}
		}

		System.out.printf("A média de salario da populção é %.2f\n", totalSalario / salario.length);
		System.out.print("A média do número de filhos é " + totalFilhos / qtdFilho.length);
		System.out.printf("\nO maior salario é %.2f\n", maxSalario);
		System.out.printf("O percentual de pessoas com salário até R$100,00 é %.2f%%",
				(salarioAteCem * 100.0) / salario.length);
	}
}
