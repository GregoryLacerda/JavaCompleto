package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double area, radio;
		double pi = 3.14159;
		
		System.out.print("Digit o Radio do circulo: ");
		
		radio = sc.nextDouble();
		
		radio = Math.pow(radio, 2.0);
		
		area = pi * radio;
		
		System.out.printf("Area: %.4f", area);
		
		
		sc.close();
	}

}
