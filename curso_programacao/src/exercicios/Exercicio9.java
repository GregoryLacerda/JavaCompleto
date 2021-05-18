package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, num;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			num = a%b;
		} else {
			num = b%a;
		}		
		
		if (num == 0) {
			System.out.println("São multiplus");
		} else {
			System.out.println("Não são multiplos");
		}		

	}

}
