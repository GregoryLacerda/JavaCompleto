package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		num = num%2;
		
		if (num == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

	}

}
