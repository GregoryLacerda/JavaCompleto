package exercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.print("Taxas: ");
		func.taxas = sc.nextDouble();
		
		System.out.println(func.toString());
		
		System.out.print("Qual a porcentagem de aumento salario: ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalarial(porcentagem);
		
		System.out.println(func.toString());		
		
	}

}
