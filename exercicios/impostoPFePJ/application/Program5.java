package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+ i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Renda Anual: ");
			double rendaAnual= sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Gastos com Saude: ");
				double gastosSaude = sc.nextDouble();				
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				
			}else {
				System.out.print("Numero de funcionarios: ");
				int numFuncionarios = sc.nextInt();				
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
			
		}
		
		double totalimposto = 0;
		
		System.out.println("Imposto pago:");
		
		for (Contribuinte contribuinte : list) {
			
			System.out.println(contribuinte.getNome() +": "+ String.format("%.2f", contribuinte.calculaImposto()));
			
			
			 totalimposto += contribuinte.calculaImposto();
		}
		
		System.out.println("");
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalimposto));
		
		sc.close();
	}

}
