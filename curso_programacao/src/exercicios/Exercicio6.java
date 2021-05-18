package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a, b, c, tRetangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		tRetangulo = (a*c) /2;
		
		circulo = pi * Math.pow(c, 2.0);
		
		trapezio = ((a + b)/2) * c;
		
		quadrado = b * b;
		
		retangulo = a * b;
		
		System.out.printf("Triangulo: %.3f%n Circulo: %.3f%n Trapezio: %.3f%n Quadrado: %.3f%n Retangulo: %.3f%n", tRetangulo, circulo, trapezio, quadrado, retangulo);
		
	}

}
