package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite as tres notas:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		double result = aluno.resultado();
		
		if (result > 60) {
			System.out.printf("FINAL GRADE = %.2f%nPASS", result);
			
		} else {
			double debNota = 60 - result;
			System.out.printf("FINAL GRADE = %.2f%nFAILED %nMISSING %.2f POINTS", result, debNota);
		}
		
		
	}

}
