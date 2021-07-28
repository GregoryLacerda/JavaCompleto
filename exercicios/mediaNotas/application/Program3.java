package application;

import java.util.Scanner;

import entities.MediaNotas;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MediaNotas notas = new MediaNotas();
		
		System.out.print("Quanta notas serão adicionadas? ");
		int nums = sc.nextInt();
		

		System.out.print("Digite as notas:");
		for (int i = 0; i < nums; i++) {
			notas.addNota(sc.nextInt());
		}
		
		
		System.out.print("Media: " + notas.media());
		
	}

}
