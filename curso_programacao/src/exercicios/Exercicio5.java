package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codigo1, codigo2, quantidade1, quantidade2;
		double valor1, valor2, valorPagar;
		
		System.out.println("Escrevao o codigo do 1ª produto, a quantidade e o valor: ");
		
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		System.out.println("Escrevao o codigo do 2º produto, a quantidade e o valor: ");
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorPagar = (double) (valor1 * quantidade1) + ( valor2 * quantidade2);
		
		System.out.printf("Valor a pagar: R$ %.2f", valorPagar);

		
		sc.close();
	}

}
