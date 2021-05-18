package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, result;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		System.out.println("Soma: " + result);

		
		sc.close();
	}

}
