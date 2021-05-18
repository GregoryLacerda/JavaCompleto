package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario;
		double horasTrab, valorPHora, salario;
		
		System.out.print("Numero do funcionario: ");
		numFuncionario = sc.nextInt();
		
		System.out.print("Horas trabalhadas: ");
		horasTrab = sc.nextDouble();
		
		System.out.print("Valor por Hora: ");
		valorPHora = sc.nextDouble();
		
		System.out.println("Numero do funcionario: " + numFuncionario);
		
		salario = valorPHora * horasTrab;
		System.out.printf("Salário: R$ %.2f", salario);		
		
		
		sc.close();

	}

}
