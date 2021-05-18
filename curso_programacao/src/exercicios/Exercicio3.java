package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, diferenca;
		
		System.out.println("Digite quatro numeros: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("Diferença: " + diferenca);
		
		
		sc.close();
	}

}
