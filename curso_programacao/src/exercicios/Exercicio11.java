package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quanti = sc.nextInt();
		
		double valor, valorFinal;
		
		if (codigo == 1) {
			valor = 4.50;
		} else if (codigo == 2) {
			valor = 4.50;
		} else if (codigo == 3) {
			valor = 5.00;
		} else if (codigo == 4) {
			valor = 2.00;
		} else {
			valor = 1.50;
		}	
		
		valorFinal = quanti * valor;
		
		System.out.println(valorFinal);
				
	}

}
