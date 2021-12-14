package D_collections.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos alunos na turma?");
		int qtdAlunos = scanner.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdNotas = scanner.nextInt();
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for(int a = 0; a < notasDaTurma.length; a++) {
			for(int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a %d° nota do %d° aluno", n + 1, a + 1);
				notasDaTurma[a][n] = scanner.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A media da turma é " + media);
		for (double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		scanner.close();
	}

}
