package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}

	}

}
